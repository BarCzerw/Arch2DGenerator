package app.combinations;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Combinations {

    public static void main(String[] args) {
        LoadCase cw = new LoadCase("CW", LoadGroupType.DL_VERTICAL);
        LoadCase cGrunt = new LoadCase("C_grunt", LoadGroupType.DL_VERTICAL);
        LoadCase cNaw = new LoadCase("C_naw", LoadGroupType.DL_VERTICAL);
        LoadCase cGzyms = new LoadCase("C_gzyms", LoadGroupType.DL_VERTICAL);
        LoadCase pGrunt = new LoadCase("P_grunt", LoadGroupType.DL_HORIZONTAL);
        LoadCase pNaw = new LoadCase("P_naw", LoadGroupType.DL_HORIZONTAL);
        LoadCase pGzyms = new LoadCase("P_gzyms", LoadGroupType.DL_HORIZONTAL);
        LoadCase tPLus = new LoadCase("T+", LoadGroupType.TEMP);
        LoadCase tMinus = new LoadCase("T-", LoadGroupType.TEMP);

        LoadCase lm1Ts1V = new LoadCase("LM-1_TS-1_pion", LoadGroupType.LIVE_P_VERTICAL);
        LoadCase lm1Ts2V = new LoadCase("LM-1_TS-2_pion", LoadGroupType.LIVE_P_VERTICAL);
        LoadCase lm21V = new LoadCase("LM-2_1_pion", LoadGroupType.LIVE_P_VERTICAL);
        LoadCase lm22V = new LoadCase("LM-2_2_pion", LoadGroupType.LIVE_P_VERTICAL);
        LoadCase mlc1201V = new LoadCase("MLC120_1_pion", LoadGroupType.LIVE_P_VERTICAL);
        LoadCase mlc1202V = new LoadCase("MLC120_2_pion", LoadGroupType.LIVE_P_VERTICAL);

        LoadCase lm1Ts1H = new LoadCase("LM-1_TS-1_parc", LoadGroupType.LIVE_P_HORIZONTAL);
        LoadCase lm1Ts2H = new LoadCase("LM-1_TS-2_parc", LoadGroupType.LIVE_P_HORIZONTAL);
        LoadCase lm21H = new LoadCase("LM-2_1_parc", LoadGroupType.LIVE_P_HORIZONTAL);
        LoadCase lm22H = new LoadCase("LM-2_2_parc", LoadGroupType.LIVE_P_HORIZONTAL);
        LoadCase mlc1201H = new LoadCase("MLC120_1_parc", LoadGroupType.LIVE_P_HORIZONTAL);
        LoadCase mlc1202H = new LoadCase("MLC120_2_parc", LoadGroupType.LIVE_P_HORIZONTAL);

        LoadCase lm1Udl1V = new LoadCase("LM-1_UDL-1_pion", LoadGroupType.LIVE_Q_VERTICAL);
        LoadCase lm1Udl2V = new LoadCase("LM-1_UDL-2_pion", LoadGroupType.LIVE_Q_VERTICAL);
        LoadCase lm41V = new LoadCase("LM-4_1_pion", LoadGroupType.LIVE_Q_VERTICAL);

        LoadCase lm1Udl1H = new LoadCase("LM-1_UDL-1_parc", LoadGroupType.LIVE_Q_HORIZONTAL);
        LoadCase lm1Udl2H = new LoadCase("LM-1_UDL-2_parc", LoadGroupType.LIVE_Q_HORIZONTAL);
        LoadCase lm41H = new LoadCase("LM-4_1_parc", LoadGroupType.LIVE_Q_HORIZONTAL);

        LoadGroup dlVertical = new LoadGroup(List.of(cw, cGrunt, cNaw, cGzyms));
        LoadGroup dlHorizontal = new LoadGroup(List.of(pGrunt, pNaw, pGzyms));
        LoadGroup temp = new LoadGroup(List.of(tPLus, tMinus));
        LoadGroup livePV = new LoadGroup(List.of(lm1Ts1V, lm1Ts2V, lm21V, lm22V, mlc1201V, mlc1202V));
        LoadGroup livePH = new LoadGroup(List.of(lm1Ts1H, lm1Ts2H, lm21H, lm22H, mlc1201H, mlc1202H));
        LoadGroup liveQV = new LoadGroup(List.of(lm1Udl1V, lm1Udl2V, lm41V));
        LoadGroup liveQH = new LoadGroup(List.of(lm1Udl1H, lm1Udl2H, lm41H));

        List<LoadGroup> loadGroupList = List.of(dlVertical, dlHorizontal, temp, livePV, livePH, liveQV, liveQH);

    }



}
