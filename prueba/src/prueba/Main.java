package prueba;



import org.hyperic.sigar.Sigar;

<<<<<<< HEAD

=======
>>>>>>> fcac29b698369f02ae72c49d74a93eb9415b7235
public class Main
{
    public static void main( String[] args ) throws Exception
    {
        Sigar sigar = new Sigar();
<<<<<<< HEAD
        long wd0,rd0=0;
        long wdf,rdf=0;
        double vW,vR=0;
       
        long tw,tr=0;
        long wd1,wd2,rd1,rd2=0;
        
        
        while (true)
        {
        	
            
            
            
            wd1=sigar.getDiskUsage("C:").getWriteBytes();
            rd1=sigar.getDiskUsage("C:").getReadBytes();
            int contAct=0;
            long endTime1 = 0;
            long startTime1 = 0;
            startTime1 = System.currentTimeMillis();
            long startTime = System.currentTimeMillis();
            /*
            for (int i=0;i<7000;i++) {
            	
            	
            	wd2=sigar.getDiskUsage("C:").getWriteBytes();
            	rd2=sigar.getDiskUsage("C:").getReadBytes();
            	
            	if(wd1!=wd2) {
            		wd1=sigar.getDiskUsage("C:").getWriteBytes();	
            		 endTime1+= System.currentTimeMillis() - startTime1;
            		 startTime1 = System.currentTimeMillis();
            	}
            	if(rd1!=rd2) {
                    rd1=sigar.getDiskUsage("C:").getReadBytes();	
                    endTime1+= System.currentTimeMillis() - startTime1;
                    startTime1 = System.currentTimeMillis();
            	}
            	
            	
            }
            
        	long endTime = System.currentTimeMillis() - startTime;
        	
        	double tiempoTotal=(double)endTime/1000;
            
        	System.out.println((double)endTime1/1000+" "+tiempoTotal+" "+(((tiempoTotal-(double)endTime1/1000)/tiempoTotal)*100));
            
            */
        	wd0= sigar.getDiskUsage("C:").getWriteBytes();
            rd0= sigar.getDiskUsage("C:").getReadBytes();
            Thread.sleep( 1000 );
            wdf=sigar.getDiskUsage("C:").getWriteBytes();
            rdf= sigar.getDiskUsage("C:").getReadBytes();
            
            vW=(((wdf-wd0)/1)/1024);
            vR=(((rdf-rd0)/1)/1024);

            System.out.println("Vel. Escritura: "+Math.abs(vW)+" KB/s "+"Vel. Lectura: "
            					+Math.abs(vR)+" KB/s ");
            
            
            
            
            
            
            
            
            			
            		
            		
        
            
           
            
=======
        while (true)
        {
            Thread.sleep( 1000 );
            System.out.println( sigar.getDiskUsage("C:") );
>>>>>>> fcac29b698369f02ae72c49d74a93eb9415b7235
        }
    }
}