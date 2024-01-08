import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DeletarPacoteComponent } from './deletar-pacote.component';

describe('DeletarPacoteComponent', () => {
  let component: DeletarPacoteComponent;
  let fixture: ComponentFixture<DeletarPacoteComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [DeletarPacoteComponent]
    });
    fixture = TestBed.createComponent(DeletarPacoteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
