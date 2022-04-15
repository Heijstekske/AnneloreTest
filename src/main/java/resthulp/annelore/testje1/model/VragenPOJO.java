package resthulp.annelore.testje1.model;

import java.util.List;

public class VragenPOJO {

   String Question;
   String correctAnswer;
   List<String> incorrectAnswers;
   String difficulty;
   String category;
   String type;

   public String getQuestion() {
      return Question;
   }

   public void setQuestion(String question) {
      Question = question;
   }

   public String getCorrectAnswer() {
      return correctAnswer;
   }

   public void setCorrectAnswer(String correctAnswer) {
      this.correctAnswer = correctAnswer;
   }

   public List<String> getIncorrectAnswers() {
      return incorrectAnswers;
   }

   public void setIncorrectAnswers(List<String> incorrectAnswers) {
      this.incorrectAnswers = incorrectAnswers;
   }

   public String getDifficulty() {
      return difficulty;
   }

   public void setDifficulty(String difficulty) {
      this.difficulty = difficulty;
   }

   public String getCategory() {
      return category;
   }

   public void setCategory(String category) {
      this.category = category;
   }

   public String getType() {
      return type;
   }

   public void setType(String type) {
      this.type = type;
   }


}
