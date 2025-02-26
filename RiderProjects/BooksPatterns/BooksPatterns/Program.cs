using System;
using BooksPatterns.creational.Factory;
using BooksPatterns.creational.Abstract;
using BooksPatterns.creational.Builder;
using BooksPatterns.creational.Prototype;
using BooksPatterns.creational.Singleton;

class Program
{
    static void Main()
    {
        var book1 = new FictionBookFactory();
        var book2 = new HistoryBookFactory();
        BookFactory fictionFactory = new FictionBookFactory();
        Console.WriteLine(fictionFactory.createBook().getTitle());

        BookFactory historyFactory = new HistoryBookFactory();
        Console.WriteLine(historyFactory.createBook().getTitle());
        
        IBookPublisher novelPublisher = new NovelPublisher();
        Console.WriteLine(novelPublisher.createPaperBook().getTitle());
        Console.WriteLine(novelPublisher.createEBook().getTitle());

        var book = new BookBuilder()
            .setTitle("Game of Thrones")
            .setAuthor("George R. R. Martin")
            .setPages(955)
            .Build();
        Console.WriteLine(book);
        var book3 = new BookBuilder()
            .setTitle("Harry Potter")
            .setAuthor("Joan Rowling")
            .setPages(400)
            .Build();
        Console.WriteLine(book3);

        var bookPrototype = new ExactBook { Title = "Exact Book" };
        var clonedBook = (ExactBook)bookPrototype.Clone();
        Console.WriteLine(clonedBook.Title);

        LibraryManager.Example.ShowMessage();
    }
}
