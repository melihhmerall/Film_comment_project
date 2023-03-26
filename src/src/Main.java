import java.io.*;
import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String args[])  {
        try {
            File author_input = new File(args[0]);
            File txt_command = new File(args[1]);
            Scanner author_user = new Scanner(author_input);
            Scanner command_user = new Scanner(txt_command);
            PrintWriter output_file = new PrintWriter("output.txt");
            List<String> commands_input = new ArrayList<>();
            List<String> authors = new ArrayList<>();
            List<String> articles = new ArrayList<>();
            List<String> output_writer = new ArrayList<>();

            while (author_user.hasNextLine()){
                String for_author = author_user.nextLine();
                authors.addAll(Arrays.asList(for_author.split(" ")));
            }
            while (command_user.hasNextLine()) {
                String for_command = command_user.nextLine();
                commands_input.addAll(Arrays.asList(for_command.split(" ")));
            }
            while(authors.size()<150){authors.add("");}

            for(int i=0; i<commands_input.size();i++) {


                if (commands_input.get(i).equals("read")) {

                    File article_input = new File(commands_input.get(i+1));

                    Scanner article_user = new Scanner(article_input);


                    while (article_user.hasNextLine()) {
                        String for_article = article_user.nextLine();
                        articles.addAll(Arrays.asList(for_article.split(" ")));


                    }


                    output_writer.clear();
                    for (int m = 0; m<authors.size();m++) {
                        if (authors.get(m).equals("AUTHOR")){
                            Author melih = new Author(authors.get(m+1)+"",authors.get(m+2)+"",authors.get(m+3)+"",authors.get(m+4)+"",authors.get(m+5)+"",authors.get(m+6)+"",authors.get(m+7)+"",authors.get(m+8)+"",authors.get(m+9)+"",authors.get(m+10)+"");
                            if(!melih.getName().equals("AUTHOR")){
                            output_writer.add("AUTHOR:"+"\t"+melih.toString());}
                            else{output_writer.add("AUTHOR:"+"\t"+melih.getId());}
                            if(!melih.getName().equals("AUTHOR")){
                                    if (articles.contains(melih.getArticle_number())){
                                        output_writer.add("+"+articles.get(articles.indexOf(melih.getArticle_number()))+"\t"+articles.get(articles.indexOf(melih.getArticle_number())+1)+"\t"+articles.get(articles.indexOf(melih.getArticle_number())+2)+"\t"+articles.get(articles.indexOf(melih.getArticle_number())+3));
                                    }
                                    if (articles.contains(melih.getArticle_number2())){
                                        output_writer.add("+"+articles.get(articles.indexOf(melih.getArticle_number2()))+"\t"+articles.get(articles.indexOf(melih.getArticle_number2())+1)+"\t"+articles.get(articles.indexOf(melih.getArticle_number2())+2)+"\t"+articles.get(articles.indexOf(melih.getArticle_number2())+3));
                                    }
                                    if (articles.contains(melih.getArticle_number3())){
                                        output_writer.add("+"+articles.get(articles.indexOf(melih.getArticle_number3()))+"\t"+articles.get(articles.indexOf(melih.getArticle_number3())+1)+"\t"+articles.get(articles.indexOf(melih.getArticle_number3())+2)+"\t"+articles.get(articles.indexOf(melih.getArticle_number3())+3));
                                    }
                                    if (articles.contains(melih.getArticle_number4())){
                                        output_writer.add("+"+articles.get(articles.indexOf(melih.getArticle_number4()))+"\t"+articles.get(articles.indexOf(melih.getArticle_number4())+1)+"\t"+articles.get(articles.indexOf(melih.getArticle_number4())+2)+"\t"+articles.get(articles.indexOf(melih.getArticle_number4())+3));
                                    }
                                    if (articles.contains(melih.getArticle_number5())){
                                        output_writer.add("+"+articles.get(articles.indexOf(melih.getArticle_number5()))+"\t"+articles.get(articles.indexOf(melih.getArticle_number5())+1)+"\t"+articles.get(articles.indexOf(melih.getArticle_number5())+2)+"\t"+articles.get(articles.indexOf(melih.getArticle_number5())+3));
                                    }}
                        }
                    }
                        }
                if (commands_input.get(i).equals("list")){
                    output_file.println("--------------------------------------List-------------------------------------");
                    if(commands_input.get(i-2).equals("read")){
                        for (int mn=0 ;mn<output_writer.size();mn++){
                            if (output_writer.get(mn).substring(0,6).equals("AUTHOR")&& mn!=0){
                                output_file.println("\n"+output_writer.get(mn));
                            }
                            else{output_file.println(output_writer.get(mn));}
                        }


                    }
                    if (commands_input.get(i-1).equals("completeAll")){
                        for (int mn=0 ;mn<output_writer.size();mn++){
                            if (output_writer.get(mn).substring(0,6).equals("AUTHOR")&& mn!=0){
                                output_file.println("\n"+output_writer.get(mn));
                            }
                            else{output_file.println(output_writer.get(mn));}
                        }


                    }

                    if(commands_input.get(i-1).equals("sortedAll")){
                        for (int mn=0 ;mn<output_writer.size();mn++){
                            output_file.println(output_writer.get(mn));}

                    }
                    if (commands_input.get(i-2).equals("del")){
                        for (int mn=0 ;mn<output_writer.size();mn++){
                            output_file.println(output_writer.get(mn));}

                    }
                    output_file.println("--------------------------------------End--------------------------------------");
                }
                if(commands_input.get(i).equals("completeAll")) {
                    output_file.println("*****************************completeAll Successful****************************");
                    output_writer.clear();
                    for (int m = 0; m<authors.size();m++) {
                        if (authors.get(m).equals("AUTHOR")) {
                            Author melih = new Author(authors.get(m + 1) + "", authors.get(m + 2) + "", authors.get(m + 3) + "", authors.get(m + 4) + "", authors.get(m + 5) + "", authors.get(m + 6) + "", authors.get(m + 7) + "", authors.get(m + 8) + "", authors.get(m + 9) + "", authors.get(m + 10) + "");
                            if(!melih.getName().equals("AUTHOR")){
                                output_writer.add("AUTHOR:"+"\t"+melih.toString());}
                            else{output_writer.add("AUTHOR:"+"\t"+melih.getId());}

                                        if (articles.contains(melih.getArticle_number())){
                                            output_writer.add("+"+articles.get(articles.indexOf(melih.getArticle_number()))+"\t"+articles.get(articles.indexOf(melih.getArticle_number())+1)+"\t"+articles.get(articles.indexOf(melih.getArticle_number())+2)+"\t"+articles.get(articles.indexOf(melih.getArticle_number())+3));
                                        }
                                        if (articles.contains(melih.getArticle_number2())){
                                            output_writer.add("+"+articles.get(articles.indexOf(melih.getArticle_number2()))+"\t"+articles.get(articles.indexOf(melih.getArticle_number2())+1)+"\t"+articles.get(articles.indexOf(melih.getArticle_number2())+2)+"\t"+articles.get(articles.indexOf(melih.getArticle_number2())+3));
                                        }
                                        if (articles.contains(melih.getArticle_number3())){
                                            output_writer.add("+"+articles.get(articles.indexOf(melih.getArticle_number3()))+"\t"+articles.get(articles.indexOf(melih.getArticle_number3())+1)+"\t"+articles.get(articles.indexOf(melih.getArticle_number3())+2)+"\t"+articles.get(articles.indexOf(melih.getArticle_number3())+3));
                                        }
                                        if (articles.contains(melih.getArticle_number4())){
                                            output_writer.add("+"+articles.get(articles.indexOf(melih.getArticle_number4()))+"\t"+articles.get(articles.indexOf(melih.getArticle_number4())+1)+"\t"+articles.get(articles.indexOf(melih.getArticle_number4())+2)+"\t"+articles.get(articles.indexOf(melih.getArticle_number4())+3));
                                        }
                                        if (articles.contains(melih.getArticle_number5())){
                                            output_writer.add("+"+articles.get(articles.indexOf(melih.getArticle_number5()))+"\t"+articles.get(articles.indexOf(melih.getArticle_number5())+1)+"\t"+articles.get(articles.indexOf(melih.getArticle_number5())+2)+"\t"+articles.get(articles.indexOf(melih.getArticle_number5())+3));
                                        }
                            for (int t = 0; t < articles.size(); t++) {
                                    if (articles.get(t).equals("ARTICLE")) {
                                        Article meral = new Article(articles.get(t + 1) + "", articles.get(t + 2) + "", articles.get(t + 3) + "", articles.get(t + 4) + "");

                                        if (!articles.contains(melih.getArticle_number5())) {
                                            if (!melih.getArticle_number().equals(meral.getPaperid()) &&!melih.getArticle_number2().equals(meral.getPaperid()) &&
                                                    !melih.getArticle_number3().equals(meral.getPaperid()) &&!melih.getArticle_number4().equals(meral.getPaperid())&& meral.getPaperid().substring(0, 3).equals(melih.getId())) {
                                                output_writer.add("+"+meral.article_use());
                                            }
                                        }
//

                                    }
                            }
                        }
                    }
                }
                if(commands_input.get(i).equals("sortedAll")){
                    output_file.println("******************************SortedAll Successful*****************************");
                    List<String> sorted_list = new ArrayList<>();
                    List<String> output_writer2 = new ArrayList<>();


                    for(int x =0;x< output_writer.size();x++) {

                        if (output_writer.get(x).substring(0, 6).equals("AUTHOR") && x < output_writer.size() - 6) {
                            if (!output_writer.get(x + 1).substring(0, 6).equals("AUTHOR") && !output_writer.get(x + 2).substring(0, 6).equals("AUTHOR") && !output_writer.get(x + 3).substring(0, 6).equals("AUTHOR") &&
                                    !output_writer.get(x + 4).substring(0, 6).equals("AUTHOR") && !output_writer.get(x + 5).substring(0, 6).equals("AUTHOR")) {
                                sorted_list.clear();
                                sorted_list.add(output_writer.get(x + 1));
                                sorted_list.add(output_writer.get(x + 2));
                                sorted_list.add(output_writer.get(x + 3));
                                sorted_list.add(output_writer.get(x + 4));
                                sorted_list.add(output_writer.get(x + 5));
                                Collections.sort(sorted_list);
                                output_writer2.add(output_writer.get(x));
                                output_writer2.add(sorted_list.get(0) + "\n" + sorted_list.get(1) + "\n" + sorted_list.get(2) + "\n" + sorted_list.get(3) + "\n" + sorted_list.get(4) + "\n");

                            }
                            else if (!output_writer.get(x + 1).substring(0, 6).equals("AUTHOR") && !output_writer.get(x + 2).substring(0, 6).equals("AUTHOR") && !output_writer.get(x + 3).substring(0, 6).equals("AUTHOR") &&
                                    !output_writer.get(x + 4).substring(0, 6).equals("AUTHOR")) {
                                sorted_list.clear();
                                sorted_list.add(output_writer.get(x + 1));
                                sorted_list.add(output_writer.get(x + 2));
                                sorted_list.add(output_writer.get(x + 3));
                                sorted_list.add(output_writer.get(x + 4));
                                output_writer2.add(output_writer.get(x));
                                output_writer2.add(sorted_list.get(0) + "\n" + sorted_list.get(1) + "\n" + sorted_list.get(2) + "\n" + sorted_list.get(3) + "\n");
                            }
                            else if (!output_writer.get(x + 1).substring(0, 6).equals("AUTHOR") && !output_writer.get(x + 2).substring(0, 6).equals("AUTHOR") && !output_writer.get(x + 3).substring(0, 6).equals("AUTHOR")) {
                                sorted_list.clear();
                                sorted_list.add(output_writer.get(x + 1));
                                sorted_list.add(output_writer.get(x + 2));
                                sorted_list.add(output_writer.get(x + 3));
                                output_writer2.add(output_writer.get(x));
                                output_writer2.add(sorted_list.get(0) + "\n" + sorted_list.get(1) + "\n" + sorted_list.get(2) + "\n");
                            }

                            else if (!output_writer.get(x+1).substring(0,6).equals("AUTHOR") && !output_writer.get(x+2).substring(0,6).equals("AUTHOR")) {
                                sorted_list.clear();
                                sorted_list.add(output_writer.get(x + 1));
                                sorted_list.add(output_writer.get(x + 2));
                                output_writer2.add(output_writer.get(x));
                                output_writer2.add(sorted_list.get(0) + "\n" + sorted_list.get(1) + "\n");
                            }
                            else if (!output_writer.get(x+1).substring(0,6).equals("AUTHOR")){
                                sorted_list.clear();
                                sorted_list.add(output_writer.get(x+1));
                                output_writer2.add(output_writer.get(x));
                                output_writer2.add(sorted_list.get(0)+"\n");
                            }
                        }
                        else if(output_writer.get(x).substring(0, 6).equals("AUTHOR") && x < output_writer.size() - 5){
                            if (!output_writer.get(x + 1).substring(0, 6).equals("AUTHOR") && !output_writer.get(x + 2).substring(0, 6).equals("AUTHOR") && !output_writer.get(x + 3).substring(0, 6).equals("AUTHOR") &&
                                    !output_writer.get(x + 4).substring(0, 6).equals("AUTHOR")) {
                                sorted_list.clear();
                                sorted_list.add(output_writer.get(x + 1));
                                sorted_list.add(output_writer.get(x + 2));
                                sorted_list.add(output_writer.get(x + 3));
                                sorted_list.add(output_writer.get(x + 4));
                                output_writer2.add(output_writer.get(x));
                                output_writer2.add(sorted_list.get(0) + "\n" + sorted_list.get(1) + "\n" + sorted_list.get(2) + "\n" + sorted_list.get(3) + "\n");
                            }
                            else if (!output_writer.get(x + 1).substring(0, 6).equals("AUTHOR") && !output_writer.get(x + 2).substring(0, 6).equals("AUTHOR") && !output_writer.get(x + 3).substring(0, 6).equals("AUTHOR")) {
                                sorted_list.clear();
                                sorted_list.add(output_writer.get(x + 1));
                                sorted_list.add(output_writer.get(x + 2));
                                sorted_list.add(output_writer.get(x + 3));
                                output_writer2.add(output_writer.get(x));
                                output_writer2.add(sorted_list.get(0) + "\n" + sorted_list.get(1) + "\n" + sorted_list.get(2) + "\n");
                            }

                            else if (!output_writer.get(x+1).substring(0,6).equals("AUTHOR") && !output_writer.get(x+2).substring(0,6).equals("AUTHOR")) {
                                sorted_list.clear();
                                sorted_list.add(output_writer.get(x + 1));
                                sorted_list.add(output_writer.get(x + 2));
                                output_writer2.add(output_writer.get(x));
                                output_writer2.add(sorted_list.get(0) + "\n" + sorted_list.get(1) + "\n");
                            }
                            else if (!output_writer.get(x+1).substring(0,6).equals("AUTHOR")){
                                sorted_list.clear();
                                sorted_list.add(output_writer.get(x+1));
                                output_writer2.add(output_writer.get(x));
                                output_writer2.add(sorted_list.get(0)+"\n");
                            }
                        }
                        else if(output_writer.get(x).substring(0, 6).equals("AUTHOR") && x < output_writer.size() - 4){
                            if (!output_writer.get(x + 1).substring(0, 6).equals("AUTHOR") && !output_writer.get(x + 2).substring(0, 6).equals("AUTHOR") && !output_writer.get(x + 3).substring(0, 6).equals("AUTHOR")) {
                                sorted_list.clear();
                                sorted_list.add(output_writer.get(x + 1));
                                sorted_list.add(output_writer.get(x + 2));
                                sorted_list.add(output_writer.get(x + 3));
                                output_writer2.add(output_writer.get(x));
                                output_writer2.add(sorted_list.get(0) + "\n" + sorted_list.get(1) + "\n" + sorted_list.get(2) + "\n");
                            }

                            else if (!output_writer.get(x+1).substring(0,6).equals("AUTHOR") && !output_writer.get(x+2).substring(0,6).equals("AUTHOR")) {
                                sorted_list.clear();
                                sorted_list.add(output_writer.get(x + 1));
                                sorted_list.add(output_writer.get(x + 2));
                                output_writer2.add(output_writer.get(x));
                                output_writer2.add(sorted_list.get(0) + "\n" + sorted_list.get(1) + "\n");
                            }
                            else if (!output_writer.get(x+1).substring(0,6).equals("AUTHOR")){
                                sorted_list.clear();
                                sorted_list.add(output_writer.get(x+1));
                                output_writer2.add(output_writer.get(x));
                                output_writer2.add(sorted_list.get(0)+"\n");
                            }
                        }
                        else if(output_writer.get(x).substring(0, 6).equals("AUTHOR") && x < output_writer.size() - 3){
                            if (!output_writer.get(x+1).substring(0,6).equals("AUTHOR") && !output_writer.get(x+2).substring(0,6).equals("AUTHOR")) {
                                sorted_list.clear();
                                sorted_list.add(output_writer.get(x + 1));
                                sorted_list.add(output_writer.get(x + 2));
                                output_writer2.add(output_writer.get(x));
                                output_writer2.add(sorted_list.get(0) + "\n" + sorted_list.get(1) + "\n");
                            }
                            else if (!output_writer.get(x+1).substring(0,6).equals("AUTHOR")){
                                sorted_list.clear();
                                sorted_list.add(output_writer.get(x+1));
                                output_writer2.add(output_writer.get(x));
                                output_writer2.add(sorted_list.get(0)+"\n");
                            }
                        }
                        else if(output_writer.get(x).substring(0, 6).equals("AUTHOR") && x < output_writer.size() - 2){
                            if (!output_writer.get(x+1).substring(0,6).equals("AUTHOR")){
                                sorted_list.clear();
                                sorted_list.add(output_writer.get(x+1));
                                output_writer2.add(output_writer.get(x));
                                output_writer2.add(sorted_list.get(0)+"\n");
                            }
                        }
                        else if(output_writer.get(x).substring(0, 6).equals("AUTHOR") && x == output_writer.size() - 1){
                            output_writer2.add(output_writer.get(x));

                        }



                    }
                    output_writer.clear();

                    for(int y = 0;y<output_writer2.size();y++){
                    output_writer.add(output_writer2.get(y));
                    }

                }


                if(commands_input.get(i).equals("del")) {
                    output_file.println("*********************************del Successful********************************");
                    for (int u = 0; u < output_writer.size(); u++) {
                        if (output_writer.get(u).substring(8,11).equals(commands_input.get(i+1))) {

                            output_writer.remove(u);
                            output_writer.remove(u);

                        }
                    }
                }

            }
            output_file.close();
            }

        catch(IOException finish) {
                    finish.printStackTrace();
        }

    }
}
