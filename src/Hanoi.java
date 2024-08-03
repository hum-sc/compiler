import java.io.*;

public class Hanoi {

	static String inst[]=new String[910];
	static String trace="";
	static String line="0";

	public static void main(String[] args){
		if(args.length>0) trace=args[0];
		if(args.length==2) line=args[1];
		inst[0]="mete 7";
		inst[1]="mete 1";
		inst[2]="asig";
		inst[3]="mete Dame el numero de discos: ";
		inst[4]="escribe";
		inst[5]="mete 5";
		inst[6]="lee";
		inst[7]="asig";
		inst[8]="mete 6";
		inst[9]="mete 45";
		inst[10]="mete 5";
		inst[11]="mem";
		inst[12]="asig";
		inst[13]="meteip";
		inst[14]="mete 4";
		inst[15]="opsum";
		inst[16]="mete 330";
		inst[17]="ira";
		inst[18]="mete 1";
		inst[19]="mem";
		inst[20]="asig";
		inst[21]="mete 6";
		inst[22]="mete 46";
		inst[23]="mete 5";
		inst[24]="mem";
		inst[25]="asig";
		inst[26]="meteip";
		inst[27]="mete 4";
		inst[28]="opsum";
		inst[29]="mete 403";
		inst[30]="ira";
		inst[31]="mete 2";
		inst[32]="mem";
		inst[33]="asig";
		inst[34]="mete 42";
		inst[35]="mete 1";
		inst[36]="asig";
		inst[37]="mete 43";
		inst[38]="mete 2";
		inst[39]="asig";
		inst[40]="mete 44";
		inst[41]="mete 3";
		inst[42]="asig";
		inst[43]="mete 6";
		inst[44]="mete 47";
		inst[45]="mete 5";
		inst[46]="mem";
		inst[47]="asig";
		inst[48]="mete 48";
		inst[49]="mete 42";
		inst[50]="mem";
		inst[51]="asig";
		inst[52]="mete 49";
		inst[53]="mete 43";
		inst[54]="mem";
		inst[55]="asig";
		inst[56]="mete 50";
		inst[57]="mete 44";
		inst[58]="mem";
		inst[59]="asig";
		inst[60]="meteip";
		inst[61]="mete 4";
		inst[62]="opsum";
		inst[63]="mete 69";
		inst[64]="ira";
		inst[65]="mete 0";
		inst[66]="mem";
		inst[67]="asig";
		inst[68]="fin";
		inst[69]="mete 51";
		inst[70]="mete 47";
		inst[71]="mem";
		inst[72]="asig";
		inst[73]="mete 52";
		inst[74]="mete 48";
		inst[75]="mem";
		inst[76]="asig";
		inst[77]="mete 53";
		inst[78]="mete 49";
		inst[79]="mem";
		inst[80]="asig";
		inst[81]="mete 54";
		inst[82]="mete 50";
		inst[83]="mem";
		inst[84]="asig";
		inst[85]="mete 51";
		inst[86]="mem";
		inst[87]="mete 1";
		inst[88]="opdif";
		inst[89]="opnot";
		inst[90]="mete 269";
		inst[91]="irverdad";
		inst[92]="mete 51";
		inst[93]="mete 51";
		inst[94]="mem";
		inst[95]="mete 1";
		inst[96]="opdif";
		inst[97]="asig";
		inst[98]="mete 6";
		inst[99]="mete 47";
		inst[100]="mete 51";
		inst[101]="mem";
		inst[102]="asig";
		inst[103]="mete 48";
		inst[104]="mete 52";
		inst[105]="mem";
		inst[106]="asig";
		inst[107]="mete 49";
		inst[108]="mete 54";
		inst[109]="mem";
		inst[110]="asig";
		inst[111]="mete 50";
		inst[112]="mete 53";
		inst[113]="mem";
		inst[114]="asig";
		inst[115]="mete 47";
		inst[116]="copia";
		inst[117]="mem";
		inst[118]="mete 48";
		inst[119]="copia";
		inst[120]="mem";
		inst[121]="mete 49";
		inst[122]="copia";
		inst[123]="mem";
		inst[124]="mete 50";
		inst[125]="copia";
		inst[126]="mem";
		inst[127]="mete 51";
		inst[128]="copia";
		inst[129]="mem";
		inst[130]="mete 52";
		inst[131]="copia";
		inst[132]="mem";
		inst[133]="mete 53";
		inst[134]="copia";
		inst[135]="mem";
		inst[136]="mete 54";
		inst[137]="copia";
		inst[138]="mem";
		inst[139]="meteip";
		inst[140]="mete 4";
		inst[141]="opsum";
		inst[142]="mete 69";
		inst[143]="ira";
		inst[144]="asig";
		inst[145]="asig";
		inst[146]="asig";
		inst[147]="asig";
		inst[148]="asig";
		inst[149]="asig";
		inst[150]="asig";
		inst[151]="asig";
		inst[152]="mete 0";
		inst[153]="mem";
		inst[154]="asig";
		inst[155]="mete 6";
		inst[156]="mete 55";
		inst[157]="mete 52";
		inst[158]="mem";
		inst[159]="asig";
		inst[160]="mete 56";
		inst[161]="mete 53";
		inst[162]="mem";
		inst[163]="asig";
		inst[164]="mete 47";
		inst[165]="copia";
		inst[166]="mem";
		inst[167]="mete 48";
		inst[168]="copia";
		inst[169]="mem";
		inst[170]="mete 49";
		inst[171]="copia";
		inst[172]="mem";
		inst[173]="mete 50";
		inst[174]="copia";
		inst[175]="mem";
		inst[176]="mete 51";
		inst[177]="copia";
		inst[178]="mem";
		inst[179]="mete 52";
		inst[180]="copia";
		inst[181]="mem";
		inst[182]="mete 53";
		inst[183]="copia";
		inst[184]="mem";
		inst[185]="mete 54";
		inst[186]="copia";
		inst[187]="mem";
		inst[188]="meteip";
		inst[189]="mete 4";
		inst[190]="opsum";
		inst[191]="mete 526";
		inst[192]="ira";
		inst[193]="asig";
		inst[194]="asig";
		inst[195]="asig";
		inst[196]="asig";
		inst[197]="asig";
		inst[198]="asig";
		inst[199]="asig";
		inst[200]="asig";
		inst[201]="mete 3";
		inst[202]="mem";
		inst[203]="asig";
		inst[204]="mete 7";
		inst[205]="mete 7";
		inst[206]="mem";
		inst[207]="mete 1";
		inst[208]="opsum";
		inst[209]="asig";
		inst[210]="mete 6";
		inst[211]="mete 47";
		inst[212]="mete 51";
		inst[213]="mem";
		inst[214]="asig";
		inst[215]="mete 48";
		inst[216]="mete 54";
		inst[217]="mem";
		inst[218]="asig";
		inst[219]="mete 49";
		inst[220]="mete 53";
		inst[221]="mem";
		inst[222]="asig";
		inst[223]="mete 50";
		inst[224]="mete 52";
		inst[225]="mem";
		inst[226]="asig";
		inst[227]="mete 47";
		inst[228]="copia";
		inst[229]="mem";
		inst[230]="mete 48";
		inst[231]="copia";
		inst[232]="mem";
		inst[233]="mete 49";
		inst[234]="copia";
		inst[235]="mem";
		inst[236]="mete 50";
		inst[237]="copia";
		inst[238]="mem";
		inst[239]="mete 51";
		inst[240]="copia";
		inst[241]="mem";
		inst[242]="mete 52";
		inst[243]="copia";
		inst[244]="mem";
		inst[245]="mete 53";
		inst[246]="copia";
		inst[247]="mem";
		inst[248]="mete 54";
		inst[249]="copia";
		inst[250]="mem";
		inst[251]="meteip";
		inst[252]="mete 4";
		inst[253]="opsum";
		inst[254]="mete 69";
		inst[255]="ira";
		inst[256]="asig";
		inst[257]="asig";
		inst[258]="asig";
		inst[259]="asig";
		inst[260]="asig";
		inst[261]="asig";
		inst[262]="asig";
		inst[263]="asig";
		inst[264]="mete 0";
		inst[265]="mem";
		inst[266]="asig";
		inst[267]="mete 324";
		inst[268]="ira";
		inst[269]="mete 6";
		inst[270]="mete 55";
		inst[271]="mete 52";
		inst[272]="mem";
		inst[273]="asig";
		inst[274]="mete 56";
		inst[275]="mete 53";
		inst[276]="mem";
		inst[277]="asig";
		inst[278]="mete 47";
		inst[279]="copia";
		inst[280]="mem";
		inst[281]="mete 48";
		inst[282]="copia";
		inst[283]="mem";
		inst[284]="mete 49";
		inst[285]="copia";
		inst[286]="mem";
		inst[287]="mete 50";
		inst[288]="copia";
		inst[289]="mem";
		inst[290]="mete 51";
		inst[291]="copia";
		inst[292]="mem";
		inst[293]="mete 52";
		inst[294]="copia";
		inst[295]="mem";
		inst[296]="mete 53";
		inst[297]="copia";
		inst[298]="mem";
		inst[299]="mete 54";
		inst[300]="copia";
		inst[301]="mem";
		inst[302]="meteip";
		inst[303]="mete 4";
		inst[304]="opsum";
		inst[305]="mete 526";
		inst[306]="ira";
		inst[307]="asig";
		inst[308]="asig";
		inst[309]="asig";
		inst[310]="asig";
		inst[311]="asig";
		inst[312]="asig";
		inst[313]="asig";
		inst[314]="asig";
		inst[315]="mete 3";
		inst[316]="mem";
		inst[317]="asig";
		inst[318]="mete 7";
		inst[319]="mete 7";
		inst[320]="mem";
		inst[321]="mete 1";
		inst[322]="opsum";
		inst[323]="asig";
		inst[324]="copia";
		inst[325]="saca";
		inst[326]="mete 0";
		inst[327]="mete 0";
		inst[328]="asig";
		inst[329]="ira";
		inst[330]="mete 57";
		inst[331]="mete 45";
		inst[332]="mem";
		inst[333]="asig";
		inst[334]="mete 39";
		inst[335]="mete 57";
		inst[336]="mem";
		inst[337]="asig";
		inst[338]="mete 40";
		inst[339]="mete 0";
		inst[340]="asig";
		inst[341]="mete 41";
		inst[342]="mete 0";
		inst[343]="asig";
		inst[344]="mete 8";
		inst[345]="mete 1.0";
		inst[346]="asig";
		inst[347]="mete 57";
		inst[348]="mem";
		inst[349]="mete 1";
		inst[350]="opdif";
		inst[351]="mete 9";
		inst[352]="opsum";
		inst[353]="mete 8";
		inst[354]="mem";
		inst[355]="asig";
		inst[356]="mete 57";
		inst[357]="mem";
		inst[358]="mete 1";
		inst[359]="opdif";
		inst[360]="mete 19";
		inst[361]="opsum";
		inst[362]="mete 0";
		inst[363]="asig";
		inst[364]="mete 57";
		inst[365]="mem";
		inst[366]="mete 1";
		inst[367]="opdif";
		inst[368]="mete 29";
		inst[369]="opsum";
		inst[370]="mete 0";
		inst[371]="asig";
		inst[372]="mete 57";
		inst[373]="mete 57";
		inst[374]="mem";
		inst[375]="mete 1";
		inst[376]="opdif";
		inst[377]="asig";
		inst[378]="mete 8";
		inst[379]="mete 8";
		inst[380]="mem";
		inst[381]="mete 1";
		inst[382]="opsum";
		inst[383]="asig";
		inst[384]="mete 0";
		inst[385]="mete 57";
		inst[386]="mem";
		inst[387]="opdif";
		inst[388]="copia";
		inst[389]="opabs";
		inst[390]="opsum";
		inst[391]="mete 0";
		inst[392]="mete 57";
		inst[393]="mem";
		inst[394]="opdif";
		inst[395]="opnot";
		inst[396]="opsum";
		inst[397]="mete 347";
		inst[398]="irfalso";
		inst[399]="mete 1";
		inst[400]="mete 0";
		inst[401]="asig";
		inst[402]="ira";
		inst[403]="mete 58";
		inst[404]="mete 46";
		inst[405]="mem";
		inst[406]="asig";
		inst[407]="mete 58";
		inst[408]="mem";
		inst[409]="mete 1";
		inst[410]="opdif";
		inst[411]="mete 9";
		inst[412]="opsum";
		inst[413]="mem";
		inst[414]="mete 0";
		inst[415]="opdif";
		inst[416]="mete 422";
		inst[417]="irverdad";
		inst[418]="mete  ";
		inst[419]="escribe";
		inst[420]="mete 430";
		inst[421]="ira";
		inst[422]="mete 58";
		inst[423]="mem";
		inst[424]="mete 1";
		inst[425]="opdif";
		inst[426]="mete 9";
		inst[427]="opsum";
		inst[428]="mem";
		inst[429]="escribe";
		inst[430]="copia";
		inst[431]="saca";
		inst[432]="mete      ";
		inst[433]="escribe";
		inst[434]="mete 58";
		inst[435]="mem";
		inst[436]="mete 1";
		inst[437]="opdif";
		inst[438]="mete 19";
		inst[439]="opsum";
		inst[440]="mem";
		inst[441]="mete 0";
		inst[442]="opdif";
		inst[443]="mete 449";
		inst[444]="irverdad";
		inst[445]="mete  ";
		inst[446]="escribe";
		inst[447]="mete 457";
		inst[448]="ira";
		inst[449]="mete 58";
		inst[450]="mem";
		inst[451]="mete 1";
		inst[452]="opdif";
		inst[453]="mete 19";
		inst[454]="opsum";
		inst[455]="mem";
		inst[456]="escribe";
		inst[457]="copia";
		inst[458]="saca";
		inst[459]="mete      ";
		inst[460]="escribe";
		inst[461]="mete 58";
		inst[462]="mem";
		inst[463]="mete 1";
		inst[464]="opdif";
		inst[465]="mete 29";
		inst[466]="opsum";
		inst[467]="mem";
		inst[468]="mete 0";
		inst[469]="opdif";
		inst[470]="mete 476";
		inst[471]="irverdad";
		inst[472]="mete  ";
		inst[473]="escribenl";
		inst[474]="mete 484";
		inst[475]="ira";
		inst[476]="mete 58";
		inst[477]="mem";
		inst[478]="mete 1";
		inst[479]="opdif";
		inst[480]="mete 29";
		inst[481]="opsum";
		inst[482]="mem";
		inst[483]="escribenl";
		inst[484]="copia";
		inst[485]="saca";
		inst[486]="mete 58";
		inst[487]="mete 58";
		inst[488]="mem";
		inst[489]="mete 1";
		inst[490]="opdif";
		inst[491]="asig";
		inst[492]="mete 0";
		inst[493]="mete 58";
		inst[494]="mem";
		inst[495]="opdif";
		inst[496]="copia";
		inst[497]="opabs";
		inst[498]="opsum";
		inst[499]="mete 0";
		inst[500]="mete 58";
		inst[501]="mem";
		inst[502]="opdif";
		inst[503]="opnot";
		inst[504]="opsum";
		inst[505]="mete 407";
		inst[506]="irfalso";
		inst[507]="mete A";
		inst[508]="escribe";
		inst[509]="mete      ";
		inst[510]="escribe";
		inst[511]="mete B";
		inst[512]="escribe";
		inst[513]="mete      ";
		inst[514]="escribe";
		inst[515]="mete C";
		inst[516]="escribenl";
		inst[517]="mete Presione <enter>";
		inst[518]="escribenl";
		inst[519]="mete 6";
		inst[520]="lee";
		inst[521]="asig";
		inst[522]="mete 2";
		inst[523]="mete 0";
		inst[524]="asig";
		inst[525]="ira";
		inst[526]="mete 59";
		inst[527]="mete 55";
		inst[528]="mem";
		inst[529]="asig";
		inst[530]="mete 60";
		inst[531]="mete 56";
		inst[532]="mem";
		inst[533]="asig";
		inst[534]="mete 7";
		inst[535]="mem";
		inst[536]="escribe";
		inst[537]="mete  ";
		inst[538]="escribe";
		inst[539]="mete Pasar disco de ";
		inst[540]="escribe";
		inst[541]="mete 61";
		inst[542]="mete 59";
		inst[543]="mem";
		inst[544]="asig";
		inst[545]="mete 55";
		inst[546]="copia";
		inst[547]="mem";
		inst[548]="mete 56";
		inst[549]="copia";
		inst[550]="mem";
		inst[551]="mete 59";
		inst[552]="copia";
		inst[553]="mem";
		inst[554]="mete 60";
		inst[555]="copia";
		inst[556]="mem";
		inst[557]="meteip";
		inst[558]="mete 4";
		inst[559]="opsum";
		inst[560]="mete 873";
		inst[561]="ira";
		inst[562]="asig";
		inst[563]="asig";
		inst[564]="asig";
		inst[565]="asig";
		inst[566]="mete 4";
		inst[567]="mem";
		inst[568]="escribe";
		inst[569]="mete  a ";
		inst[570]="escribe";
		inst[571]="mete 61";
		inst[572]="mete 60";
		inst[573]="mem";
		inst[574]="asig";
		inst[575]="mete 55";
		inst[576]="copia";
		inst[577]="mem";
		inst[578]="mete 56";
		inst[579]="copia";
		inst[580]="mem";
		inst[581]="mete 59";
		inst[582]="copia";
		inst[583]="mem";
		inst[584]="mete 60";
		inst[585]="copia";
		inst[586]="mem";
		inst[587]="meteip";
		inst[588]="mete 4";
		inst[589]="opsum";
		inst[590]="mete 873";
		inst[591]="ira";
		inst[592]="asig";
		inst[593]="asig";
		inst[594]="asig";
		inst[595]="asig";
		inst[596]="mete 4";
		inst[597]="mem";
		inst[598]="escribenl";
		inst[599]="mete 59";
		inst[600]="mem";
		inst[601]="mete 1";
		inst[602]="opdif";
		inst[603]="opnot";
		inst[604]="mete 767";
		inst[605]="irverdad";
		inst[606]="mete 59";
		inst[607]="mem";
		inst[608]="mete 2";
		inst[609]="opdif";
		inst[610]="opnot";
		inst[611]="mete 689";
		inst[612]="irverdad";
		inst[613]="mete 60";
		inst[614]="mem";
		inst[615]="mete 1";
		inst[616]="opdif";
		inst[617]="opnot";
		inst[618]="mete 651";
		inst[619]="irverdad";
		inst[620]="mete 60";
		inst[621]="mem";
		inst[622]="mete 2";
		inst[623]="opdif";
		inst[624]="opnot";
		inst[625]="mete 647";
		inst[626]="irfalso";
		inst[627]="mete 40";
		inst[628]="mete 40";
		inst[629]="mem";
		inst[630]="mete 1";
		inst[631]="opsum";
		inst[632]="asig";
		inst[633]="mete 40";
		inst[634]="mem";
		inst[635]="mete 1";
		inst[636]="opdif";
		inst[637]="mete 19";
		inst[638]="opsum";
		inst[639]="mete 41";
		inst[640]="mem";
		inst[641]="mete 1";
		inst[642]="opdif";
		inst[643]="mete 29";
		inst[644]="opsum";
		inst[645]="mem";
		inst[646]="asig";
		inst[647]="copia";
		inst[648]="saca";
		inst[649]="mete 671";
		inst[650]="ira";
		inst[651]="mete 39";
		inst[652]="mete 39";
		inst[653]="mem";
		inst[654]="mete 1";
		inst[655]="opsum";
		inst[656]="asig";
		inst[657]="mete 39";
		inst[658]="mem";
		inst[659]="mete 1";
		inst[660]="opdif";
		inst[661]="mete 9";
		inst[662]="opsum";
		inst[663]="mete 41";
		inst[664]="mem";
		inst[665]="mete 1";
		inst[666]="opdif";
		inst[667]="mete 29";
		inst[668]="opsum";
		inst[669]="mem";
		inst[670]="asig";
		inst[671]="copia";
		inst[672]="saca";
		inst[673]="mete 41";
		inst[674]="mem";
		inst[675]="mete 1";
		inst[676]="opdif";
		inst[677]="mete 29";
		inst[678]="opsum";
		inst[679]="mete 0";
		inst[680]="asig";
		inst[681]="mete 41";
		inst[682]="mete 41";
		inst[683]="mem";
		inst[684]="mete 1";
		inst[685]="opdif";
		inst[686]="asig";
		inst[687]="mete 763";
		inst[688]="ira";
		inst[689]="mete 60";
		inst[690]="mem";
		inst[691]="mete 1";
		inst[692]="opdif";
		inst[693]="opnot";
		inst[694]="mete 727";
		inst[695]="irverdad";
		inst[696]="mete 60";
		inst[697]="mem";
		inst[698]="mete 3";
		inst[699]="opdif";
		inst[700]="opnot";
		inst[701]="mete 723";
		inst[702]="irfalso";
		inst[703]="mete 41";
		inst[704]="mete 41";
		inst[705]="mem";
		inst[706]="mete 1";
		inst[707]="opsum";
		inst[708]="asig";
		inst[709]="mete 41";
		inst[710]="mem";
		inst[711]="mete 1";
		inst[712]="opdif";
		inst[713]="mete 29";
		inst[714]="opsum";
		inst[715]="mete 40";
		inst[716]="mem";
		inst[717]="mete 1";
		inst[718]="opdif";
		inst[719]="mete 19";
		inst[720]="opsum";
		inst[721]="mem";
		inst[722]="asig";
		inst[723]="copia";
		inst[724]="saca";
		inst[725]="mete 747";
		inst[726]="ira";
		inst[727]="mete 39";
		inst[728]="mete 39";
		inst[729]="mem";
		inst[730]="mete 1";
		inst[731]="opsum";
		inst[732]="asig";
		inst[733]="mete 39";
		inst[734]="mem";
		inst[735]="mete 1";
		inst[736]="opdif";
		inst[737]="mete 9";
		inst[738]="opsum";
		inst[739]="mete 40";
		inst[740]="mem";
		inst[741]="mete 1";
		inst[742]="opdif";
		inst[743]="mete 19";
		inst[744]="opsum";
		inst[745]="mem";
		inst[746]="asig";
		inst[747]="copia";
		inst[748]="saca";
		inst[749]="mete 40";
		inst[750]="mem";
		inst[751]="mete 1";
		inst[752]="opdif";
		inst[753]="mete 19";
		inst[754]="opsum";
		inst[755]="mete 0";
		inst[756]="asig";
		inst[757]="mete 40";
		inst[758]="mete 40";
		inst[759]="mem";
		inst[760]="mete 1";
		inst[761]="opdif";
		inst[762]="asig";
		inst[763]="copia";
		inst[764]="saca";
		inst[765]="mete 841";
		inst[766]="ira";
		inst[767]="mete 60";
		inst[768]="mem";
		inst[769]="mete 2";
		inst[770]="opdif";
		inst[771]="opnot";
		inst[772]="mete 805";
		inst[773]="irverdad";
		inst[774]="mete 60";
		inst[775]="mem";
		inst[776]="mete 3";
		inst[777]="opdif";
		inst[778]="opnot";
		inst[779]="mete 801";
		inst[780]="irfalso";
		inst[781]="mete 41";
		inst[782]="mete 41";
		inst[783]="mem";
		inst[784]="mete 1";
		inst[785]="opsum";
		inst[786]="asig";
		inst[787]="mete 41";
		inst[788]="mem";
		inst[789]="mete 1";
		inst[790]="opdif";
		inst[791]="mete 29";
		inst[792]="opsum";
		inst[793]="mete 39";
		inst[794]="mem";
		inst[795]="mete 1";
		inst[796]="opdif";
		inst[797]="mete 9";
		inst[798]="opsum";
		inst[799]="mem";
		inst[800]="asig";
		inst[801]="copia";
		inst[802]="saca";
		inst[803]="mete 825";
		inst[804]="ira";
		inst[805]="mete 40";
		inst[806]="mete 40";
		inst[807]="mem";
		inst[808]="mete 1";
		inst[809]="opsum";
		inst[810]="asig";
		inst[811]="mete 40";
		inst[812]="mem";
		inst[813]="mete 1";
		inst[814]="opdif";
		inst[815]="mete 19";
		inst[816]="opsum";
		inst[817]="mete 39";
		inst[818]="mem";
		inst[819]="mete 1";
		inst[820]="opdif";
		inst[821]="mete 9";
		inst[822]="opsum";
		inst[823]="mem";
		inst[824]="asig";
		inst[825]="copia";
		inst[826]="saca";
		inst[827]="mete 39";
		inst[828]="mem";
		inst[829]="mete 1";
		inst[830]="opdif";
		inst[831]="mete 9";
		inst[832]="opsum";
		inst[833]="mete 0";
		inst[834]="asig";
		inst[835]="mete 39";
		inst[836]="mete 39";
		inst[837]="mem";
		inst[838]="mete 1";
		inst[839]="opdif";
		inst[840]="asig";
		inst[841]="copia";
		inst[842]="saca";
		inst[843]="mete 3";
		inst[844]="mete 46";
		inst[845]="mete 5";
		inst[846]="mem";
		inst[847]="asig";
		inst[848]="mete 55";
		inst[849]="copia";
		inst[850]="mem";
		inst[851]="mete 56";
		inst[852]="copia";
		inst[853]="mem";
		inst[854]="mete 59";
		inst[855]="copia";
		inst[856]="mem";
		inst[857]="mete 60";
		inst[858]="copia";
		inst[859]="mem";
		inst[860]="meteip";
		inst[861]="mete 4";
		inst[862]="opsum";
		inst[863]="mete 403";
		inst[864]="ira";
		inst[865]="asig";
		inst[866]="asig";
		inst[867]="asig";
		inst[868]="asig";
		inst[869]="mete 2";
		inst[870]="mem";
		inst[871]="asig";
		inst[872]="ira";
		inst[873]="mete 62";
		inst[874]="mete 61";
		inst[875]="mem";
		inst[876]="asig";
		inst[877]="mete 62";
		inst[878]="mem";
		inst[879]="mete 1";
		inst[880]="opdif";
		inst[881]="opnot";
		inst[882]="mete 903";
		inst[883]="irverdad";
		inst[884]="mete 62";
		inst[885]="mem";
		inst[886]="mete 2";
		inst[887]="opdif";
		inst[888]="opnot";
		inst[889]="mete 896";
		inst[890]="irverdad";
		inst[891]="mete 4";
		inst[892]="mete Columna C";
		inst[893]="asig";
		inst[894]="mete 899";
		inst[895]="ira";
		inst[896]="mete 4";
		inst[897]="mete Columna B";
		inst[898]="asig";
		inst[899]="copia";
		inst[900]="saca";
		inst[901]="mete 906";
		inst[902]="ira";
		inst[903]="mete 4";
		inst[904]="mete Columna A";
		inst[905]="asig";
		inst[906]="copia";
		inst[907]="saca";
		inst[908]="ira";
		inst[909]="fin";
		MaqCAPJava.programa(inst,args);
	}

}