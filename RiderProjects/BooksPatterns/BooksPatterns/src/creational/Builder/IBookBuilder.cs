namespace BooksPatterns.creational.Builder;

public interface IBookBuilder
{
    IBookBuilder setTitle(string title);
    IBookBuilder setAuthor(string author);
    IBookBuilder setPages(int pages);
    Book Build();
}