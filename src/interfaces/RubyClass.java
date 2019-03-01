package interfaces;

public class RubyClass extends ProgramingLanguage implements InterfaceOne, OOPLanguage {

	@Override
	public void code() {
		System.out.println("coding using ruby");
	}

	@Override
	public void compile() {
		System.out.println("compiling ruby code");
	}

	@Override
	public void execute() {
		System.out.println("executing ruby program");
	}

	@Override
	public void design() {
		System.out.println("designin from ooplanguage from rubyClass");
	}

	@Override
	public void buildApplication() {
		System.out.println("debuggin program from ruby class");
		
	}

}
