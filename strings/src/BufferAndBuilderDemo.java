public class BufferAndBuilderDemo
{
    public static void main(String[] args)
    {
        StringBuilder builderCity= new StringBuilder();
        builderCity.append("mumbai");
        System.out.println("bulder city: "+builderCity);//mumbai
        System.out.println("buildr city.capacity(): "+builderCity.capacity());//16

        StringBuffer bufferCity = new StringBuffer();
        bufferCity.append("pune");
        System.out.println("buffer city : "+bufferCity );//pune
        System.out.println("buffer city.capacity(): "+bufferCity.capacity());//16


    }
}
