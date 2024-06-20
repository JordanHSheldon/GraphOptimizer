package GraphOptimizer.Main;

import java.util.ArrayList;
import java.util.List;

public class PointsService{
    private List<Points> graphPoints;

    public PointsService(int length){
        graphPoints = new ArrayList<>();
        GeneratePoints(length);
    }

    public List<Points> GetPoints(){
        return graphPoints;
    }

    private void GeneratePoints(int length){
        for(int i = 0; i < length ;i++){
            graphPoints.add(new Points());
        }
    }

    @Override
    public String toString() {
        String result = "";
        if(graphPoints == null){
            return result;
        }

        for(int i = 0; i < graphPoints.size();i++){
            result += graphPoints.get(i).toString() +"\n";
        }

        return result;
    }
}