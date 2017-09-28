package dip.lab3.student.solution1;

/**
 *
 * @author Benjamin
 */
public class Message {
    private MessageInput input;
    private MessageOutput output;
    
    public Message (MessageInput input, MessageOutput output){
        this.input = input;
        this.output = output;
    }
    
    public final void getMessage(){
        String line = output.readln();
        input.writeln(line);
    }
}
