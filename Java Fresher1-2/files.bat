set filePathName=
cd %filePathName%
set /p Input=Filename:

:: Create files
echo. > %Input%.java

:: write code 
echo import java.util.Scanner; >> %Input%.java
echo. >> %Input%.java
echo public class %Input% { >> %Input%.java
echo   public static void main(String[] args) { >> %Input%.java
echo     Scanner input = new Scanner(System.in); >> %Input%.java
echo     %Input% obj = new %Input%(); >> %Input%.java
echo.      >> %Input%.java
echo   } >> %Input%.java
echo. >> %Input%.java
echo   String input(String x) { >> %Input%.java
echo     Scanner input = new Scanner(System.in); >> %Input%.java
echo     System.out.print(x); >> %Input%.java
echo     return input.nextLine(); >> %Input%.java
echo   } >> %Input%.java
echo. >> %Input%.java
echo   void display(String x) { >> %Input%.java
echo     System.out.println(x); >> %Input%.java
echo   } >> %Input%.java
echo } >> %Input%.java

:: open file path
:: %SystemRoot%\explorer.exe %filePathName% 