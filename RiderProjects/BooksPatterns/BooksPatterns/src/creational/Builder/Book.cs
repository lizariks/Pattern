namespace BooksPatterns.creational.Builder;

public class Book
{
    public string Title { get; set; } = "";
    public string Author { get; set; } = "";
    public int Pages { get; set; }
    public override string ToString()=> $"{Title} by {Author} with pages {Pages}";
    }