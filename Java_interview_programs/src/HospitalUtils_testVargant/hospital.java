package HospitalUtils_testVargant;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class hospital {

	Map<patient, Date> hospital = new HashMap<patient, Date>();

	public void addPatient(patient p) {
		hospital.put(p, p.getDateOfRegistration());
	}

	public void getStats(Date statsDate) {
		SimpleDateFormat sdf = new SimpleDateFormat("M/dd/yyyy");

		Set s = hospital.entrySet();
		Iterator it = s.iterator();
		int total = 0;
		int localite = 0;
		Map.Entry<patient, Date> list = (Map.Entry) it.next();
		
		Set<patient> keySet = hospital.keySet();
		
		keySet.stream().filter(p->sdf.format(new Date()).
				equals(sdf.format(hospital.get(p)))).filter(p->p.isLocalite()==true).
				forEach(p->System.out.println("Patient Names through Lambda "+ p.getName()));
		
		
		
		long count = keySet.stream().filter(p->sdf.format(new Date()).
				equals(sdf.format(hospital.get(p)))).filter(p->p.isLocalite()==true).count();
		System.out.println("Through lambda"+ count);
		
		for(patient p: keySet)
		{
			System.out.println(p.getName());
			System.out.println(sdf.format(hospital.get(p)));
			System.out.println(sdf.format(new Date()).equals(sdf.format(hospital.get(p))));
			total++;
			if(sdf.format(new Date()).equals(sdf.format(hospital.get(p))) && p.isLocalite()==true)
					{
						localite++;
					}
			
		}
		System.out.println(total);
		System.out.println(localite);

		double percentage=(localite/(double) total)*100;
		System.out.println(percentage);
	}

}
