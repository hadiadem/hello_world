package creatNames;

public class FilterNames extends enter{


	String arraystr[]={"hadiadem"};
	int[]arrayint={0};

	String [] newArray1;
	int []newArray2;
	public String [] array3(String ss)
	{
		int n=arraystr.length;
		String [] newArray1=new String[n+1];
		for(int i=0;i<arraystr.length;i++)
		{
			newArray1[i]=arraystr[i];
		}
		newArray1[n]=ss;
		return newArray1;
	}
	public int [] array3(int ii)
	{
		int n=arrayint.length;
		int [] newArray2=new int[n+1];
		for(int i=0;i<arraystr.length;i++)
		{
			newArray2[i]=arrayint[i];
		}
		newArray2[n]=ii;
		return newArray2;
	}

	public String [] filter(String []arra)
	{
		for(int i=0;i<arra.length;i++)//ÇááæÈ ÇáÎÇÕ ÈÇáãÑæÑ ÈÌãíÚ ÚäÇÕÑ ÇáãÕÝæÝÉ
		{
			if(arra[i].length()==2)
			{
				String ss1=Character.toString(arra[i].charAt(0));
				String ss2=Character.toString(arra[i].charAt(1));
				String sm=ss1+ss2;

					if(  (ss1.equalsIgnoreCase("a") & ss2.equalsIgnoreCase("h"))
						|(ss1.equalsIgnoreCase("o") & ss2.equalsIgnoreCase("z"))
						|(ss1.equalsIgnoreCase("o") & ss2.equalsIgnoreCase("h"))
						|(ss1.equalsIgnoreCase("l") & ss2.equalsIgnoreCase("i"))
						|(ss1.equalsIgnoreCase("o") & ss2.equalsIgnoreCase("n"))
						|(ss1.equalsIgnoreCase("i") & ss2.equalsIgnoreCase("s"))
						|(ss1.equalsIgnoreCase("i") & ss2.equalsIgnoreCase("t"))
						|(ss1.equalsIgnoreCase("o") & ss2.equalsIgnoreCase("f"))
						|(ss1.equalsIgnoreCase("o") & ss2.equalsIgnoreCase("r"))
						|(ss1.equalsIgnoreCase("n") & ss2.equalsIgnoreCase("o"))
						|(ss1.equalsIgnoreCase("h") & ss2.equalsIgnoreCase("e"))
						|(ss1.equalsIgnoreCase("h") & ss2.equalsIgnoreCase("i")))
					{
						arrayint=array3(i);
						arraystr=array3(sm);
					}
					else
					{
						System.out.println("name nbr "+(i)+" in array is invalid name???");
					}




			}// end if2 ****************************************************************

			else if(arra[i].length()==3)
			{
				String ss1=Character.toString(arra[i].charAt(0));
				String ss2=Character.toString(arra[i].charAt(1));
				String ss3=Character.toString(arra[i].charAt(2));
				String sm=ss1+ss2+ss3;

				if(      (ss1.equalsIgnoreCase("s") & ss2.equalsIgnoreCase("h") & ss3.equalsIgnoreCase("e"))
						|(ss1.equalsIgnoreCase("o") & ss2.equalsIgnoreCase("f") & ss3.equalsIgnoreCase("f"))
						|(ss1.equalsIgnoreCase("a") & ss2.equalsIgnoreCase("n") & ss3.equalsIgnoreCase("d"))
						|(ss1.equalsIgnoreCase("e") & ss2.equalsIgnoreCase("n") & ss3.equalsIgnoreCase("d"))
						|(ss1.equalsIgnoreCase("a") & ss2.equalsIgnoreCase("r") & ss3.equalsIgnoreCase("e"))
						|(ss1.equalsIgnoreCase("t") & ss2.equalsIgnoreCase("h") & ss3.equalsIgnoreCase("e"))
						|(ss1.equalsIgnoreCase("f") & ss2.equalsIgnoreCase("o") & ss3.equalsIgnoreCase("r")))
				{
					arrayint=array3(i);
					arraystr=array3(sm);
				}
				else
				{
					System.out.println("name nbr "+(i)+" in array is invalid name???");
				}





			}// end if3 **********************************************************

			else if(arra[i].length()==4)
			{
				String ss1=Character.toString(arra[i].charAt(0));
				String ss2=Character.toString(arra[i].charAt(1));
				String ss3=Character.toString(arra[i].charAt(2));
				String ss4=Character.toString(arra[i].charAt(3));
				String sm=ss1+ss2+ss3+ss4;

			    if(      (ss1.equalsIgnoreCase("c") & ss2.equalsIgnoreCase("h"))
						|(ss1.equalsIgnoreCase("s") & ss2.equalsIgnoreCase("h"))
						|(ss1.equalsIgnoreCase("p") & ss2.equalsIgnoreCase("h"))
						|(ss1.equalsIgnoreCase("k") & ss2.equalsIgnoreCase("h")))
				{
			    	arrayint=array3(i);
					arraystr=array3(sm);
				}
			    else
				{
					System.out.println("name nbr "+(i)+" in array is invalid name???");
				}



			}//end if4*********************************************************

			else if(arra[i].length()==5)
			{
				String ss1=Character.toString(arra[i].charAt(0));
				String ss2=Character.toString(arra[i].charAt(1));
				String ss3=Character.toString(arra[i].charAt(2));
				String ss4=Character.toString(arra[i].charAt(3));
				String ss5=Character.toString(arra[i].charAt(4));
				String sm=ss1+ss2+ss3+ss4+ss5;

			    if(       (ss1.equalsIgnoreCase("c") & ss2.equalsIgnoreCase("h"))
						||(ss1.equalsIgnoreCase("s") & ss2.equalsIgnoreCase("h"))
						||(ss1.equalsIgnoreCase("p") & ss2.equalsIgnoreCase("h"))
						||(ss1.equalsIgnoreCase("k") & ss2.equalsIgnoreCase("h")))
				{
			    	arrayint=array3(i);
					arraystr=array3(sm);
    			}
			    else
				{
					System.out.println("name nbr "+(i)+" in array is invalid name???");
				}
	    	}




       }
		System.out.println("********************************************** \n \n");
		System.out.println("\n \n Potential correct names of characters entered");//ÇáÇÓãÇÁ ÇáÕÍíÍÉ ÇáãÍÊãáÉ

		if(arraystr==null)
		{
			System.out.println("\n \n Non names .........Sorry.....???");
		}
		else
		{
			System.out.println("correct names in the dictionary and it number in Possible names array  is");//ÚÏÏ ÇáÇÓãÇÁ ÇáÛíÑ ãÑÌÍÉ ÇäåÇ ÇÓãÇÁ æÚÏÏåÇ
			for(int i=1;i<arraystr.length;i++)
			{
				System.out.print(arrayint[i]+" : ");
				System.out.println(arraystr[i]);
			}
		}
		return arraystr;


	}
}
