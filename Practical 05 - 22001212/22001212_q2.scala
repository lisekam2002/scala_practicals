object LibraryManagement{
    case class Book(title:String,author:String,isbn:String);

    var bookCollection:Set[Book]=Set(
        Book("Madolduwa","Sir Martin Wickramasinghe","0001"),
        Book("Ambayaluwo","Mr.T.B.Illangaratna","0002"),
        Book("Famous Five","Enid Blyton","0003")
    )

    def addBook(bCollection:Set[Book],book:Book):Set[Book]={
        if(bCollection.exists(_.title==book.title)){
            println("Book is already in the coolection");
            bCollection;
        }
        else{
            val newCollection=bCollection+book;
            println(f"${book.title} is added to the collection");
            newCollection;
        }
    }

    def removeBook(bCollection:Set[Book]):Set[Book]={
        print("Enter the ISBN of the book to remove = ");
        val i=scala.io.StdIn.readLine();
        val bookToRemove = bCollection.find(_.isbn == i);
        bookToRemove match{
            case Some(book) =>
                val newCollection = bCollection - book;
                println(s"${book.title} is removed from the collection");
                newCollection;
            case None =>
                println("Book is not found to remove.");
                bCollection;
        }
    }

    def checkBook(bCollection:Set[Book]):Unit={
        print("Enter the ISBN of the book to check = ");
        val i=scala.io.StdIn.readLine();
        if(bCollection.exists(_.isbn==i)){
            println(f"${i} Book is found");
        }
        else{
            println("Book is not found");
        }
    }

    def displayCurrentLibrary(bCollection:Set[Book]):Unit={
        println("\nISBN"+" "*18+"Title"+" "*18+"Author");
        bCollection.foreach{book=>
            println(f"${book.isbn}%-20s ${book.title}%-20s ${book.author}%-20s");
        } 
    }

    def searchBook(bCollection:Set[Book]):Unit={
        print("Enter the title of the book to search = ");
        val t=scala.io.StdIn.readLine();
        val sbook=bCollection.find(_.title==t);
        sbook match {
            case Some(book) =>
                println(f"Title: ${book.title}");
                println(f"Author: ${book.author}");
            case None =>
                println("Book is not found")
        }
    }

    def displayAuthor(bCollection:Set[Book]):Unit={
        print("Enter the author of the book to see his books = ");
        val a=scala.io.StdIn.readLine();
        val abook=bCollection.filter(_.author==a);
        abook.foreach{book=>
           println(f"${book.title}"); 
        }
    }

    def main(args:Array[String]):Unit={
        var newBook=Book("Secret Seven","Enid Blyton","0004");
        bookCollection=addBook(bookCollection,newBook);
        displayCurrentLibrary(bookCollection);
        bookCollection=removeBook(bookCollection);
        displayCurrentLibrary(bookCollection);
        checkBook(bookCollection);
        searchBook(bookCollection);
        displayAuthor(bookCollection);
    }
}