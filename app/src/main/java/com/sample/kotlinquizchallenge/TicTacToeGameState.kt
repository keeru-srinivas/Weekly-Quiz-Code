package com.sample.kotlinquizchallenge

/*
* Model a Tic Tac Toe game with board state and game status.
*
* // Input
* // X _ _
* // O X _
* // O _ X

* // Expected Output
* gameState.status → GameStatus.X_WINS
* gameState.currentPlayer → null (game ended)
* */

enum class GameStatus {
    IN_PROGRESS,
    X_WINS,
    O_WINS,
    DRAW
}

class TicTacToe(private val board: Array<CharArray>) {
    var status: GameStatus = GameStatus.IN_PROGRESS
        private set
    var currentPlayer: Char? = 'X'
        private set

    init {
        updateGameStatus()
    }

    private fun updateGameStatus() {
        val winner = checkWinner()
        status = when (winner) {
            'X' -> GameStatus.X_WINS
            'O' -> GameStatus.O_WINS
            else -> {
                if (board.all { row -> row.all { it == 'X' || it == 'O' } })
                    GameStatus.DRAW
                else
                    GameStatus.IN_PROGRESS
            }
        }

        // If game ended, no current player
        currentPlayer = if (status == GameStatus.IN_PROGRESS) currentPlayer else null
    }

    private fun checkWinner(): Char? {
        // Check rows
        for (i in 0..2) {
            if (board[i][0] != '_' && board[i][0] == board[i][1] && board[i][1] == board[i][2])
                return board[i][0]
        }

        // Check columns
        for (j in 0..2) {
            if (board[0][j] != '_' && board[0][j] == board[1][j] && board[1][j] == board[2][j])
                return board[0][j]
        }

        // Check diagonals
        if (board[0][0] != '_' && board[0][0] == board[1][1] && board[1][1] == board[2][2])
            return board[0][0]
        if (board[0][2] != '_' && board[0][2] == board[1][1] && board[1][1] == board[2][0])
            return board[0][2]

        return null // No winner
    }
}

fun main() {
    val board = arrayOf(
        charArrayOf('X', '_', '_'),
        charArrayOf('O', 'X', '_'),
        charArrayOf('O', '_', 'X')
    )

    val game = TicTacToe(board)
    println("Game Status → ${game.status}")
    println("Current Player → ${game.currentPlayer}")
}
