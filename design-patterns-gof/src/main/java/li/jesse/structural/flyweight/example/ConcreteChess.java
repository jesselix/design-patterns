package li.jesse.structural.flyweight.example;

public class ConcreteChess implements ChessFlyWeight
{
    private String color;

    public ConcreteChess(String color)
    {
        super();
        this.color = color;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    @Override
    public void display(ChessCoordinate c)
    {
        System.out.println("棋子颜色：" + color);
        System.out.println("棋子位置：" + c.getX() + "---" + c.getY());
    }
}
