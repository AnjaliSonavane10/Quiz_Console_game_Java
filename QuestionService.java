import java.util.*;
public class QuestionService {
    Question[] questions=new Question[5];
    String answers[]=new String[5];

    public QuestionService(){
        questions[0]=new Question(1,"which lang?","Math","Java","Python","C++","Java");
        questions[1]=new Question(2,"What is ==?","Assisgnment op","Equals to opertor","Addition","symbol","Equals to opertor");
        questions[2]=new Question(3,"what is int?","Symbol","datatype","Python","C++","datatype");
        questions[3]=new Question(4,"is indendation follwed in java?","No","Yes","May be","None","No");
        questions[4]=new Question(5,"Which type of datatype is String?","Primitive","Non primitive","Python","C++","Primitive");

    }
    int i=0;

    public void StartQuiz(){
        for(Question q:questions){
            System.out.println(q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            System.out.println("Enter your answer: ");
            Scanner sc=new Scanner(System.in);
            answers[i]=sc.nextLine();
            i++;
            System.out.println("--------------------------------------------");
        }
    }

    public void QuizAnswers(){
        int score=0;
        for(int i=0;i<questions.length;i++){
            Question que=questions[i];

            String ans=que.getAnswer();

            if(answers[i].equals(ans)){
                score++;
            }
        }

        System.out.println("Your score: "+score);
    }
}
