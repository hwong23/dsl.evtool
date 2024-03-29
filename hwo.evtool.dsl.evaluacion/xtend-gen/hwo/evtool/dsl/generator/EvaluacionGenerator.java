/**
 * generated by Xtext 2.25.0
 */
package hwo.evtool.dsl.generator;

import com.google.common.collect.Iterables;
import hwo.evtool.dsl.evaluacion.CalificarEquipo;
import hwo.evtool.dsl.evaluacion.CalificarOtros;
import hwo.evtool.dsl.evaluacion.CalificarPropuesta;
import hwo.evtool.dsl.evaluacion.Componente;
import hwo.evtool.dsl.evaluacion.E_Calificacion;
import hwo.evtool.dsl.evaluacion.Evaluacion;
import hwo.evtool.dsl.evaluacion.TipoEquipo;
import hwo.evtool.dsl.evaluacion.TipoPropuesta;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class EvaluacionGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterable<Componente> _filter = Iterables.<Componente>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Componente.class);
    for (final Componente e : _filter) {
      String _name = e.getName();
      String _plus = (_name + ".java");
      fsa.generateFile(_plus, 
        this.compile(e));
    }
  }
  
  public CharSequence compile(final Componente e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import hwo.evtool.componenteEvaluacion.*;");
    _builder.newLine();
    _builder.append("import hwo.evtool.ejecucion.Control;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    String _name = e.getName();
    _builder.append(_name);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    {
      EList<Evaluacion> _actions = e.getActions();
      for(final Evaluacion c : _actions) {
        _builder.append("\t\t");
        CharSequence _declareStrings = this.declareStrings(c);
        _builder.append(_declareStrings, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static void main(String[] args) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("new ");
    String _name_1 = e.getName();
    _builder.append(_name_1, "\t\t");
    _builder.append("().run();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("protected void run() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Control cntrol = new Control ();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    {
      EList<Evaluacion> _actions_1 = e.getActions();
      for(final Evaluacion c_1 : _actions_1) {
        _builder.append("\t\t");
        CharSequence _declareCommand = this.declareCommand(c_1);
        _builder.append(_declareCommand, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    int i = 0;
    _builder.newLineIfNotEmpty();
    {
      EList<Evaluacion> _actions_2 = e.getActions();
      for(final Evaluacion c_2 : _actions_2) {
        _builder.append("\t\t");
        int _plusPlus = i++;
        CharSequence _ponerComando = this.ponerComando(c_2, _plusPlus);
        _builder.append(_ponerComando, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("\t\t");
    int j = 0;
    _builder.newLineIfNotEmpty();
    {
      EList<Evaluacion> _actions_3 = e.getActions();
      for(final Evaluacion c_3 : _actions_3) {
        _builder.append("\t\t");
        int _plusPlus_1 = j++;
        CharSequence _callCommand = this.callCommand(c_3, _plusPlus_1);
        _builder.append(_callCommand, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("System.out.println(\"--- Total \" + cntrol.getTotal());");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence callCommand(final Evaluacion comando, final int i) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("cntrol.llamarEvaluacion1(");
    _builder.append(i);
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence ponerComando(final Evaluacion c, final int i) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/* llamador */ cntrol.setComando(");
    _builder.append(i);
    _builder.append(", cmpnt");
    String _name = c.getName();
    _builder.append(_name);
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence declareCommand(final Evaluacion c) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence tipo = this.typeValue(c);
    _builder.newLineIfNotEmpty();
    _builder.append("/* solicitd */ Cmpnnt_");
    _builder.append(tipo);
    _builder.append(" cmpnt");
    String _name = c.getName();
    _builder.append(_name);
    _builder.append(" = new Cmpnnt_");
    _builder.append(tipo);
    _builder.append("(str_");
    String _name_1 = c.getName();
    _builder.append(_name_1);
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence declareStrings(final Evaluacion c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("String[] str_");
    String _name = c.getName();
    _builder.append(_name);
    _builder.append(" = {\"");
    String _name_1 = c.getName();
    _builder.append(_name_1);
    _builder.append("\",\"");
    CharSequence _stringValue = this.stringValue(c);
    _builder.append(_stringValue);
    _builder.append("\",\"");
    String _name_2 = c.eClass().getName();
    _builder.append(_name_2);
    _builder.append("\"};");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _stringValue(final CalificarPropuesta c) {
    StringConcatenation _builder = new StringConcatenation();
    TipoPropuesta _tipo = c.getTipo();
    _builder.append(_tipo);
    _builder.append("\", \"");
    E_Calificacion _puntuacion = c.getPuntuacion();
    _builder.append(_puntuacion);
    return _builder;
  }
  
  protected CharSequence _stringValue(final CalificarEquipo c) {
    StringConcatenation _builder = new StringConcatenation();
    TipoEquipo _tipo = c.getTipo();
    _builder.append(_tipo);
    _builder.append("\", \"");
    int _numerador = c.getNumerador();
    _builder.append(_numerador);
    _builder.append("\", \"");
    int _denominador = c.getDenominador();
    _builder.append(_denominador);
    return _builder;
  }
  
  protected CharSequence _stringValue(final CalificarOtros c) {
    StringConcatenation _builder = new StringConcatenation();
    String _tipo = c.getTipo();
    _builder.append(_tipo);
    _builder.append("\", \"");
    int _valor = c.getValor();
    _builder.append(_valor);
    return _builder;
  }
  
  protected CharSequence _typeValue(final CalificarPropuesta c) {
    StringConcatenation _builder = new StringConcatenation();
    TipoPropuesta _tipo = c.getTipo();
    _builder.append(_tipo);
    return _builder;
  }
  
  protected CharSequence _typeValue(final CalificarEquipo c) {
    StringConcatenation _builder = new StringConcatenation();
    TipoEquipo _tipo = c.getTipo();
    _builder.append(_tipo);
    return _builder;
  }
  
  protected CharSequence _typeValue(final CalificarOtros c) {
    StringConcatenation _builder = new StringConcatenation();
    String _tipo = c.getTipo();
    _builder.append(_tipo);
    return _builder;
  }
  
  protected CharSequence stringValue(final Evaluacion c) {
    if (c instanceof CalificarEquipo) {
      return _stringValue((CalificarEquipo)c);
    } else if (c instanceof CalificarOtros) {
      return _stringValue((CalificarOtros)c);
    } else if (c instanceof CalificarPropuesta) {
      return _stringValue((CalificarPropuesta)c);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(c).toString());
    }
  }
  
  protected CharSequence typeValue(final Evaluacion c) {
    if (c instanceof CalificarEquipo) {
      return _typeValue((CalificarEquipo)c);
    } else if (c instanceof CalificarOtros) {
      return _typeValue((CalificarOtros)c);
    } else if (c instanceof CalificarPropuesta) {
      return _typeValue((CalificarPropuesta)c);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(c).toString());
    }
  }
}
