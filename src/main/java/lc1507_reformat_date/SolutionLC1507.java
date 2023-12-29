package lc1507_reformat_date;

public class SolutionLC1507 {
    public String reformatDate(String date) {
        String[] dateArr = date.split(" ");
        StringBuilder sb = new StringBuilder().append(dateArr[2]);
        switch (dateArr[1]) {
            case "Jan": sb.append("-01-"); break;
            case "Feb": sb.append("-02-"); break;
            case "Mar": sb.append("-03-"); break;
            case "Apr": sb.append("-04-"); break;
            case "May": sb.append("-05-"); break;
            case "Jun": sb.append("-06-"); break;
            case "Jul": sb.append("-07-"); break;
            case "Aug": sb.append("-08-"); break;
            case "Sep": sb.append("-09-"); break;
            case "Oct": sb.append("-10-"); break;
            case "Nov": sb.append("-11-"); break;
            case "Dec": sb.append("-12-"); break;
        }
        String dayStr = dateArr[0].substring(0, dateArr[0].length() - 2);
        if (dayStr.length() == 1)
            sb.append(0);
        return sb.append(dayStr).toString();
    }
}
