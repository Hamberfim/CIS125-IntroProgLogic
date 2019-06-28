Class And Object App
Chapter 7, Complete Exercise #8 p 223

8.    Complete the following tasks:

a.    Design a class named Book that holds a stock number, author, title, price, and a number of pages for a book. Include methods to get and set the values for each data field.
b.    Design an application that declares two Book objects and sets and displays their values.
c.    Design an application that declares an array of 10 Books. Prompt the user for data for each of the Books, and then display all the values.

d. DesignaclassnamedTextBookthatisachildclassofBook.Includeanewdata field for the grade level of the book. Add get and set methods for the new field.
e.    Design an application that instantiates a Book and a TextBook and demonstrates all the methods of each class

This is worth 15 points


a.)
class Book
    Fields
        private num stockNum
        private string author
        private string title
        private num price
        private num pages

    Methods
        public void setStockNum(num bookStockNum)
            stockNum = bookStockNum
        return

        public void setAuthor(string bookAuthor)
            author = bookAuthor
        return

        public void setTitle(string bookTitle)
            title = bookTitle
        return

        public void setPrice(num bookPrice)
            price = bookPrice
        return

        public void setPages(num bookPages)
            pages = bookPages
        return

        public num getStockNum()
        return stockNum

        public string getAuthor()
        return author

        public string getTitle()
        return title

        public num getPrice()
        return price

        public num getPages()
        return pages
endClass

b.)
start
    Declarations
        Book poems
        Book novel

        num stockNum
        string author
        string title
        num price
        num pages

    poems.setStockNum(stockNum)
    poems.setAuthor("Ben Beverly")
    poems.setTitle("Some kind of Poems")
    poems.setPrice(19.99)
    poems.setPages(205)

    stockNum = poems.getStockNum()
    author = poems.getAuthor()
    title = poems.getTitle()
    price = poems.getPrice()
    pages = poems.getPages()

    novel.setStockNum(stockNum)
    novel.setAuthor("Karla Van Dubious")
    novel.setTitle("Lackluster Reading")
    novel.setPrice(49.99)
    novel.setPages(458)

    stockNum = novel.getStockNum()
    author = novel.getAuthor()
    title = novel.getTitle()
    price = novel.getPrice()
    pages = novel.getPages()

    output poems.stockNum, poems.author, poems.title, poems.price, poems.pages
    output novel.stockNum, novel.author, novel.title, novel.price, novel.pages
stop

c.)
start
    INDEX_SIZE = 10
    num books[INDEX_SIZE]

    num stockNum
    string author
    string title
    num price
    num pages

    index = 0
    while index < INDEX_SIZE
        books = input stockNum[index]
        books = input author[index]
        books = input title[index]
        books = input price[index]
        books = input pages[index]
        index = index + 1
    endwhile

    index = 0
    while index < INDEX_SIZE
        output books[index]
        index = index + 1
    endwhile
stop
