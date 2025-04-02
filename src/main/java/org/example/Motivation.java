package org.example;
import org.example.Main;
import java.time.LocalDate;

public class Motivation {

        private int id;
        private LocalDate regDate;
        private String content;
        private String author;

        //        public Motivation(int id, String regDate, String content, String author) {
        public Motivation(int id, LocalDate regDate , String content, String author) {
            this.id = id;
            this.regDate = regDate;
            this.content = content;
            this.author = author;

        }

        public int getId() {
            return id;
        }
        public LocalDate getregDate(){
            return regDate;
        }


        public String getContent() {
            return content;
        }

        public String getAuthor() {
            return author;
        }


        public void setId(int id) {
            this.id = id;
        }
        public void setregDate(){
            this. regDate = regDate;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

    }
}
