public class Author {
    private String id ,name , university , department ,  email , article_number , article_number2 , article_number3 , article_number4 , article_number5;
    public Author(String id, String name, String university,
                  String department, String email,
                  String article_number, String article_number2, String article_number3, String article_number4, String article_number5) {
        this.id = id;
        this.name = name;
        this.university = university;
        this.department = department;
        this.email = email;
        this.article_number = article_number;
        this.article_number2 = article_number2;
        this.article_number3 = article_number3;
        this.article_number4 = article_number4;
        this.article_number5 = article_number5;
    }

    public String toString2(){
        return String.format("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s",id,name,university,department,email,article_number,article_number2,article_number3,article_number4,article_number5);

    }
    public String article_numbers(){
        return String.format("%s\t%s\t%s\t%s\t%s",article_number,article_number2,article_number3,article_number4,article_number5);
    }
    public String toString(){
        return String.format("%s\t%s\t%s\t%s\t%s",id,name,university,department,email);
    }

    public String getId(){return id;}
    public String getName(){return name;}
    public String getUniversity(){return university;}
    public String getDepartment(){return department;}
    public String getEmail(){return email;}
    public String getArticle_number(){return article_number;}
    public String getArticle_number2(){return article_number2;}
    public String getArticle_number3(){return article_number3;}
    public String getArticle_number4(){return article_number4;}
    public String getArticle_number5(){return article_number5;}

}
       //         if(commands_input.get(i).equals("list")){

//                    for (int m = 0; m<authors.size();m++) {
//                        if (authors.get(m).equals("AUTHOR")){
//                            Author melih = new Author(authors.get(m+1)+"\t",authors.get(m+2)+"\t",authors.get(m+3)+"\t",authors.get(m+4)+"\t",authors.get(m+5)+"\t",authors.get(m+6)+"\t",authors.get(m+7)+"\t",authors.get(m+8)+"\t",authors.get(m+9)+"\t",authors.get(m+10)+"");
//                            output_file.println("AUTHOR:"+"\t"+melih.toString2());
//                            for (int t = 0;t<articles.size();){}

//                            List<String> authoras = new ArrayList<>();
//                            List<String> author_line = new ArrayList<>(Arrays.asList(melih.toString2().split("\t")));
//                            for(int z = 0; z < author_line.size();z++){
//                                if (author_line.get(z).equals(""));}
//                            output_file.println(author_line);
//
//                        }
//                        else{continue;}
//                    }
         //               }



//                                    if (meral.getPaperid().equals(melih.getArticle_number())) {
//                                            output_file.println("+" + meral.article_use());
//                                            }
//                                            if (meral.getPaperid().equals(melih.getArticle_number2())) {
//                                            output_file.println("+" + meral.article_use());
//                                            }
//                                            if (meral.getPaperid().equals(melih.getArticle_number3())) {
//                                            output_file.println("+" + meral.article_use());
//                                            }
//                                            if (meral.getPaperid().equals(melih.getArticle_number4())) {
//                                            output_file.println("+" + meral.article_use());
//                                            }
//                                            if (meral.getPaperid().equals(melih.getArticle_number5())) {
//                                            output_file.println("+" + meral.article_use());
//                                            }





//                    for (int m = 0; m<authors.size();m++) {
//                        if (authors.get(m).equals("AUTHOR")){
//                            Author melih = new Author(authors.get(m+1)+"",authors.get(m+2)+"",authors.get(m+3)+"",authors.get(m+4)+"",authors.get(m+5)+"",authors.get(m+6)+"",authors.get(m+7)+"",authors.get(m+8)+"",authors.get(m+9)+"",authors.get(m+10)+"");
//                            output_file.println("AUTHOR:"+"\t"+melih.toString());
//
//
//                            for(int t=0; t<articles.size();t++){
//                                if(articles.get(t).equals("ARTICLE")) {
//                                    Article meral = new Article(articles.get(t + 1) + "", articles.get(t + 2) + "", articles.get(t + 3) + "", articles.get(t + 4) + "");
//
//                                    if(melih.getArticle_number().equals(meral.getPaperid())){
//                                        deneme.add("+"+meral.article_use());
//                                    }
//                                    if(melih.getArticle_number2().equals(meral.getPaperid())){
//                                        deneme.add("+"+meral.article_use());
//                                    }
//                                    if(melih.getArticle_number3().equals(meral.getPaperid())){
//                                        deneme.add("+"+meral.article_use());
//                                    }
//                                    if(melih.getArticle_number4().equals(meral.getPaperid())){
//                                        deneme.add("+"+meral.article_use());
//                                    }
//                                    if(melih.getArticle_number5().equals(meral.getPaperid())){
//                                        deneme.add("+"+meral.article_use());
//                                    }
//                                }
//                                else {continue;}



//                            }
//                            Collections.sort(deneme);
//                            for (int x=0 ;x<deneme.size();x++){
//                            output_file.println(deneme.get(x));
//                            }
//                            deneme.clear();
//                        }
//                        else{continue;}
//
//                    }



//                if (commands_input.get(i).equals("sortedAll")){
//                        output_file.println("----------------------------------------------sortedALL---------------------------------------------");
//                        for (int m = 0; m<authors.size();m++) {
//                            if (authors.get(m).equals("AUTHOR")) {
//                                Author melih = new Author(authors.get(m + 1) + "", authors.get(m + 2) + "", authors.get(m + 3) + "", authors.get(m + 4) + "", authors.get(m + 5) + "", authors.get(m + 6) + "", authors.get(m + 7) + "", authors.get(m + 8) + "", authors.get(m + 9) + "", authors.get(m + 10) + "");
//
//                                for (int t = 0; t < articles.size(); t++) {
//                                    if (articles.get(t).equals("ARTICLE")) {
//                                        Article meral = new Article(articles.get(t + 1) + "", articles.get(t + 2) + "", articles.get(t + 3) + "", articles.get(t + 4) + "");
//                                        for (int as = 0; as<output_writer.size();as++)
//
//                                            if(output_writer.get(as).equals(meral.getPaperid())){
//
//                                            }
//                                        else {continue;}
//                                    }
//                                }
//                            }
//                        }
//                }



//
//
//                                    if (!meral.getPaperid().equals(melih.getArticle_number())&& meral.getPaperid().substring(0,3).equals(authors.get(m+1))) {
//                                            output_writer.add(melih.getArticle_number());
//
//                                            }
//                                            if (articles.contains(melih.getArticle_number())){
//                                            output_writer.add("+"+articles.get(articles.indexOf(melih.getArticle_number()))+"\t"+articles.get(articles.indexOf(melih.getArticle_number())+1)+"\t"+articles.get(articles.indexOf(melih.getArticle_number())+2)+"\t"+articles.get(articles.indexOf(melih.getArticle_number())+3));
//                                            }
////                                    if (!meral.getPaperid().equals(melih.getArticle_number2())) {
////                                        output_writer.add("+" + articles.get(articles.indexOf(melih.getArticle_number2())) + "\t" + articles.get(articles.indexOf(melih.getArticle_number2()) + 1) + "\t" + articles.get(articles.indexOf(melih.getArticle_number2()) + 2) + "\t" + articles.get(articles.indexOf(melih.getArticle_number2()) + 3));
////
////                                    }
////                                    if (!meral.getPaperid().equals(melih.getArticle_number3())&& !melih.getArticle_number3().contains(meral.getPaperid())) {
////                                        output_writer.add("+" + articles.get(articles.indexOf(melih.getArticle_number3())) + "\t" + articles.get(articles.indexOf(melih.getArticle_number3()) + 1) + "\t" + articles.get(articles.indexOf(melih.getArticle_number3()) + 2) + "\t" + articles.get(articles.indexOf(melih.getArticle_number3()) + 3));
////
////                                    }
////                                    if (!meral.getPaperid().equals(melih.getArticle_number4())) {
////                                        output_writer.add("+" + articles.get(articles.indexOf(melih.getArticle_number4())) + "\t" + articles.get(articles.indexOf(melih.getArticle_number4()) + 1) + "\t" + articles.get(articles.indexOf(melih.getArticle_number4()) + 2) + "\t" + articles.get(articles.indexOf(melih.getArticle_number4()) + 3));
////
////                                    }
////                                    if (!meral.getPaperid().equals(melih.getArticle_number5())) {
////                                        output_writer.add("+" + articles.get(articles.indexOf(melih.getArticle_number5())) + "\t" + articles.get(articles.indexOf(melih.getArticle_number5()) + 1) + "\t" + articles.get(articles.indexOf(melih.getArticle_number5()) + 2) + "\t" + articles.get(articles.indexOf(melih.getArticle_number5()) + 3));
////
////                                    }
//
//
//                                            if (articles.contains(melih.getArticle_number2())){
//                                            output_writer.add("+"+articles.get(articles.indexOf(melih.getArticle_number2()))+"\t"+articles.get(articles.indexOf(melih.getArticle_number2())+1)+"\t"+articles.get(articles.indexOf(melih.getArticle_number2())+2)+"\t"+articles.get(articles.indexOf(melih.getArticle_number2())+3));
//                                            }
//                                            if (articles.contains(melih.getArticle_number3())){
//                                            output_writer.add("+"+articles.get(articles.indexOf(melih.getArticle_number3()))+"\t"+articles.get(articles.indexOf(melih.getArticle_number3())+1)+"\t"+articles.get(articles.indexOf(melih.getArticle_number3())+2)+"\t"+articles.get(articles.indexOf(melih.getArticle_number3())+3));
//                                            }
//                                            if (articles.contains(melih.getArticle_number4())){
//                                            output_writer.add("+"+articles.get(articles.indexOf(melih.getArticle_number4()))+"\t"+articles.get(articles.indexOf(melih.getArticle_number4())+1)+"\t"+articles.get(articles.indexOf(melih.getArticle_number4())+2)+"\t"+articles.get(articles.indexOf(melih.getArticle_number4())+3));
//                                            }
//                                            if (articles.contains(melih.getArticle_number5())){
//                                            output_writer.add("+"+articles.get(articles.indexOf(melih.getArticle_number5()))+"\t"+articles.get(articles.indexOf(melih.getArticle_number5())+1)+"\t"+articles.get(articles.indexOf(melih.getArticle_number5())+2)+"\t"+articles.get(articles.indexOf(melih.getArticle_number5())+3));
//                                            }
//
//                                            }

// if (!articles.contains(melih.getArticle_number())) {
//         if (meral.getPaperid().substring(0, 3).equals(melih.getId())) {
//         System.out.println(meral.article_use());
//         }
//         }
//         if(!articles.contains(melih.getArticle_number2())){
//         if(!melih.getArticle_number().equals(meral.getPaperid()) && meral.getPaperid().substring(0, 3).equals(melih.getId())){
//         System.out.println(meral.article_use());
//         }
//         }
//         if (!articles.contains(melih.getArticle_number3())){
//         if(!melih.getArticle_number().equals(meral.getPaperid()) &&!melih.getArticle_number2().equals(meral.getPaperid())&&
//         meral.getPaperid().substring(0, 3).equals(melih.getId())){
//         System.out.println(meral.article_use());
//         }
//         }