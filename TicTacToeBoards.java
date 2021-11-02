import java.awt.Color;

public class TicTacToeBoards {

    // assigns wsuWindow to var win
    private WsuWindow win;

    // Constructor intializes field win, calls methods
    public TicTacToeBoards() {

        // Initalizes win, with demensions 300 pixels wide, 330 pixels tall, at 10,10
        win = new WsuWindow(10, 10, 300, 330);

        // draws plain game board with parameters to set the location
        drawTicTacToeBoard(40, 40);

        // draws colored board with parameters that set location and line colors
        drawTicTacToeBoard(40, 170, java.awt.Color.pink);

        // draws board, with the parameters setting location, and the last number sets
        // the thickness of line
        drawTicTacToeBoard(170, 40, 5);

        // draws another plain board with the parameters to set the location
        drawTicTacToeBoard(170, 170);

    }

    // make method that draws the tictactoe board
    // @param x the x value of the endpoints of the lines
    // @param y the y value of the endpoints of the lines

    public void drawTicTacToeBoard(int x, int y) {

        // draws top horizontal line of board using params x and y
        WsuLine line1;
        line1 = new WsuLine(x, y, x + 90, y);
        win.add(line1);

        // draws the bottom line of the board
        WsuLine line2;
        line2 = new WsuLine(x, y + 30, x + 90, y + 30);
        win.add(line2);

        // draws the left vertical line of the board
        WsuLine line3;
        line3 = new WsuLine(x + 30, y - 30, x + 30, y + 60);
        win.add(line3);

        // draws the right vertical line of the board
        WsuLine line4;
        line4 = new WsuLine(x + 60, y - 30, x + 60, y + 60);
        win.add(line4);

        // repaints window
        win.repaint();

    }

    // method draws the colored tictactoe board
    // @param x the x value of the endpoints of the lines
    // @param y the y value of the endpoints of the lines
    // @param rgb the color of the lines

    public void drawTicTacToeBoard(int x, int y, java.awt.Color rgb) {

        // draws the top horizontal line of the colored board

        WsuLine line1;
        line1 = new WsuLine(x, y, x + 90, y);

        // colors the top horizontal line with the color rgb
        line1.setForeground(rgb);
        win.add(line1);

        // draws the bottom horizontal line of the colored board

        WsuLine line2;
        line2 = new WsuLine(x, y + 30, x + 90, y + 30);

        // colors the bottom horizontal line with the color rgb
        line2.setForeground(rgb);
        win.add(line2);

        // draws the left vertical line of the colored board
        WsuLine line3;
        line3 = new WsuLine(x + 30, y - 30, x + 30, y + 60);

        // colors the left vertical line with the color rgb
        line3.setForeground(rgb);
        win.add(line3);

        // draws the right vertical line of the colored board
        // uses parameters x and y
        WsuLine line4;
        line4 = new WsuLine(x + 60, y - 30, x + 60, y + 60);

        // colors the rightmost vertical line with the color rgb, given in the method
        // call
        line4.setForeground(rgb);
        win.add(line4);

        // repaints the window
        win.repaint();
    }

    /**
     *
     * This is the method that draws the board that can have thicker lines
     *
     * @param x y value of the endpoints of the lines
     *
     * @param y y value of the endpoints of the lines
     *
     * @param i width of the lines
     */
    public void drawTicTacToeBoard(int x, int y, int i) {

        // draws the top horizontal line of the board with adjustable thickness
        // using the params x and y
        WsuLine line1;
        line1 = new WsuLine(x, y, x + 90, y);
        win.add(line1);

        // Draws a rectangle that uses third parameter
        // drawn on top of the horizontal line to show thicker lines
        WsuRectangle rect1;
        rect1 = new WsuRectangle(x, y, 90, i);

        // makess rectangle black
        rect1.setFilled(true);
        rect1.setBackground(Color.black);
        win.add(rect1);

        // draws the bottom horizontal line of the board with thickness
        // using the params x and y
        WsuLine line2;
        line2 = new WsuLine(x, y + 30, x + 90, y + 30);
        win.add(line2);

        // Draws a rectangle that uses the thrid parameter i
        // this will be drawn over the bottom horizontal line to simulate the lines
        // getting thicker
        WsuRectangle rect2;
        rect2 = new WsuRectangle(x, y + 30, 90, i);

        // Colors the rectangle black
        rect2.setFilled(true);
        rect2.setBackground(Color.black);
        win.add(rect2);

        // draws left vertical line of the board with thickness
        WsuLine line3;
        line3 = new WsuLine(x + 30, y - 30, x + 30, y + 60);
        win.add(line3);

        // Draws a rectangle that uses the third parameter i
        // this will be drawn over the left vertical line to simulate thicker lines
        WsuRectangle rect3;
        rect3 = new WsuRectangle(x + 30, y - 30, i, 90);

        // colors rectangle black
        rect3.setFilled(true);
        rect3.setBackground(Color.black);
        win.add(rect3);

        // draws the right vertical line of the board with thickness
        WsuLine line4;
        line4 = new WsuLine(x + 60, y - 30, x + 60, y + 60);
        win.add(line4);

        // Draws rectangle that uses the third parameter i
        // will be drawn on top of the right vertical line to simulate thicker lines
        WsuRectangle rect4;
        rect4 = new WsuRectangle(x + 60, y - 30, i, 90);

        // makes rectangle black
        rect4.setFilled(true);
        rect4.setBackground(Color.black);
        win.add(rect4);

        // repaints window
        win.repaint();
    }

    /**
     *
     * The application method that runs the code like an application
     *
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new TicTacToeBoards().drawTicTacToeBoard(0, 0, null);

    }
}
