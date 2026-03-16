package lab2.task2.main;

import lab2.task2.models.*;
import java.util.Scanner;

public class ChessGame {
    public static void main(String[] args) {
        Board board = new Board();
        board.setupStandardBoard();
        Scanner sc = new Scanner(System.in);

        while (true) {
            board.draw();
            System.out.print("Ваш ход или 'exit': ");
            String input = sc.nextLine().toLowerCase();

            if (input.equals("exit")) break;

            String[] parts = input.split(" ");
            if (parts.length < 2) continue;

            try {
                Position start = new Position(parts[0].charAt(0), Character.getNumericValue(parts[0].charAt(1)));
                Position end = new Position(parts[1].charAt(0), Character.getNumericValue(parts[1].charAt(1)));

                Piece p = board.getPiece(start);

                if (p != null && p.isLegalMove(board, start, end)) {
                    board.movePiece(start, end);
                    System.out.println("Успешно");
                } else {
                    System.out.println("Недопустимый ход !!!");
                }
            } catch (Exception e) {
                System.out.println("Ошибка! Формат: e2 e4");
            }
        }
    }
}